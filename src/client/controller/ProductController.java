package client.controller;

import admin.dto.ProductDetail;
import admin.model.Comment;
import admin.model.Customer;
import admin.model.Product;
import admin.service.CommentService;
import admin.service.ProductService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.*;

@WebServlet("/product")
public class ProductController extends HttpServlet {
    ProductService productService = new ProductService();
    CommentService commentService = new CommentService();
    Gson gson = new Gson();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType ("text/html;charset=utf-8");
        String action = req.getParameter("action");
        if(action != null){
            if(action.equalsIgnoreCase("wish-list")){
                req.getRequestDispatcher("/client/pages/wish-list.jsp").forward(req, resp);
            }

        }else{
            String code = req.getParameter("code");
            ProductDetail product = productService.detail(new Product(code));
            //Customer customer = (Customer) session.getAttribute("currentCustomer");
            Comment comment = new Comment();
            Product p = new Product();
            p.setId(product.getId());
            comment.setProduct(p);
            List<Comment> listComment = commentService.getAll(comment);
            req.setAttribute("comments", listComment);
            req.setAttribute("product", product);
            req.getRequestDispatcher("/client/pages/product-detail.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType ("text/html;charset=utf-8");
        String action = req.getParameter("action");
        if(action.equalsIgnoreCase("get-new-product")){
            Cookie cookie = getCookie(req.getCookies());

            if (cookie != null) {
                List<Product> list = productService.getProductNew();
                if (list.size() == 0){
                    resp.getWriter().write(gson.toJson(null));
                    return;
                }
                String value = cookie.getValue();
                String split[] = value.split("&");
                //Integer size = Integer.parseInt(split[1].split("_")[1]);
                Integer seen = Integer.parseInt(split[1].split("_")[1]);
                if(seen == 2){
                    resp.getWriter().write(gson.toJson(list));
                }else
                    resp.getWriter().write(gson.toJson(null));
            }

        }
        if (action.equalsIgnoreCase("get-notification")){
            List<String> codes = new ArrayList<String>(Arrays.asList(req.getParameter("arr_code").split(",")));
            List<Product> list = productService.getProductNew();
            if(list.size() < codes.size()){
                resp.getWriter().write(gson.toJson(null));
                return;
            }
            for (Product p: list) {
                if(codes.indexOf(p.getCode()) == -1){
                    resp.getWriter().write(gson.toJson(true));
                    return;
                }
            }
            resp.getWriter().write(gson.toJson(false));
        }
        if(action.equalsIgnoreCase("add-comment")){
            String comment = req.getParameter("comment");
            Integer starVote = Integer.parseInt(req.getParameter("star-vote"));
            Integer pid = Integer.parseInt(req.getParameter("productId"));
            Customer customer = (Customer) session.getAttribute("currentCustomer");
            //
            Customer customer1 = new Customer();
            customer1.setName(customer.getName());
            customer1.setId(customer.getId());
            //
            Product product = new Product();
            product.setId(pid);
            //
            Comment comment1 = new Comment();
            comment1.setStarVote(starVote);
            comment1.setProduct(product);
            comment1.setCustomer(customer1);
            comment1.setComment(comment);
            comment1.setCreateAt(new Timestamp(new Date().getTime()));
            if(commentService.add(comment1)){
                resp.getWriter().write(gson.toJson(comment1));
            }else resp.getWriter().write(gson.toJson(false));
        }
    }
    public Cookie getCookie(Cookie[] cookies){
        Cookie cookie = null;
        for (Cookie c : cookies) {
            if(c.getName().equalsIgnoreCase("CustomUser")){
                cookie = c;
                break;
            }

        }
        return cookie;
    }
}
