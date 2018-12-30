BÁO CÁO BÀI TẬP LỚN MÔN LẬP TRÌNH WEB

HỌC KỲ I NĂM HỌC 2018 - 2019

Nhóm: 2[5]

Thành viên:

	1.	Họ và tên: Ngô Thị Thúy Linh	Mã sinh viên: B15DCCN310
	2.	Họ và tên: Chu Thế Huy	Mã sinh viên: B15DCCN277

Nội dung

1.Giới thiệu sơ lược chủ đề

	a.Mục tiêu
	−Tạo được 1 trang web bán sách thân thiện với người dùng, giao diện đẹp, đầy đủ các chức năng nghiệp vụ
	−Tạo 1 trang quản lý: thêm sửa xóa, xem chi tiết, thống kê
	−Xây dựng trang web theo mô hình MVC

	b.Kết quả đã đạt được
	−Xây dựng trang web theo mô hình MVC
	−Tạo được trang web đã đầy đủ yêu cầu đặt ra
	−Các bảng dữ liệu gồm 12 bảng: role, user, bill, bill_detail, author, commet, customer, delivery_type, nxb, order_detail, products, type
	Các công nghệ  sử dụng trong trang web:
		CSS
		Materialize
		HTML5
		Jquery
		Gson
		MVC 
		Session, LocalStorage
		Ajax

2.Phân công công việc


	STT		Họ tên				Các nội dung thực hiện												Đánh giá
	1		Ngô Thị Thúy Linh	−Web quản lý: Quản lý user, thống kê hóa đơn, thống kê, sản phẩm
								−HTML: giao diện trang bán hàng										Hoàn thành các nội dung
	2		Chu Thế Huy			−Web người dùng: đổ dữ liệu, xử lý các chức năng
								−HTML: giao diện quản lý											Hoàn thành các nội dung

3.Quá trình thưc hiện



	Phiên bản 1.0:
		Trang home	
			- HTML:
					  Sử dụng các thẻ ngữ nghĩa
					  Cấu trúc một trang web cơ bản
			- CSS:
					Sử dụng các thuộc tính cơ bản
					Sử dụng grid, flex	2 tuần		
	Phiên bản2.0:	
		Cho phép lọc sản phẩm từ dữ liệu json, hỗ trợ tải thêm mỗi lần 6 sản phẩm	
			Sử dụng jquey để xử lý
			File json để lưu sản phẩm
			Ajax để load sản phẩm từ file
			Hàm sort để sắp xếp 
			Localstorage lưu giỏ hàng	3 tuần		
		Cho phép cấu hình tiền tệ và ngôn ngữ tương ứng	Jquery
			Localstorage lưu mã ngôn ngữ, mã tiền tệ hiện tại
			File json lưu ngôn ngữ English và Vietnam			
	 	Lọc dữ liệu theo tiêu chí	
	 		Jquery			
		Phiên bản 3.0:	
		Web shop	
		Tính toán hóa đơn dựa theo khoảng cách	API map google, jquery
			-Tính khoảng cách(km) từ địa chỉ cố định đến địa chỉ nhập
			-Tính tiền ship dựa trên quãng đường	
		Khách hàng lưu lại và xuất ra file danh sách sản phẩm yêu thích	Jquery
			-khách hàng thêm sản phẩm yêu thích vào danh sách được lưu vào localstorage
			-sử dụng jquery tạo chuỗi xml rồi download dưới dạng text/plan			
		Gửi thông tin mua hàng đến email của khách hàng	
			-jquery mở cửa sổ print cho phép khách hàng download đơn hàng đã đặt
			-javax mail(jsp) cho phép gửi đơn hàng về mail với định dạng html đã dựng sẵn			
		Thông báo cho khách hàng sản phẩm mới khi có	
			-sử dụng cookie để lưu khách hàng đã vào trang web
			-cookie lưu ngày vào đầu tiên và lần vào (-lần 1 ko có thông báo nếu có sản phẩm mới,khi khách hàng vào trang lần 2 sẽ update cookie thành lần 2 và sẽ có thông báo khi có sản phẩm mới)
			- sản phẩm mới: sản phẩm trong vòng 3 ngày, được thêm sau thời điểm khách hàng vào trang lần đầu
			- mỗi khách sẽ xem sản phẩm mới 1 lần			
		Bình luận sản phẩm 	
			-jquey : thêm bình luận, vote sao cho sản phẩm
			-jsp servlet lưu bình luận vào database
			-lấy dữ liệu qua ajax mỗi khi khách bấm bình luận			
		Đăng ký đăng nhập 	
			-jquery ajax trao đổi dữ liệu
			-mã hóa mật khẩu md5 khi lưu vào database
			-check email đã tồn tại khi đăng ký
			-HttpSession để lưu user đã đăng nhập thành công
			-Sử dụng pattern html 5 để check password			
		Lọc các sản phẩm theo các tiêu chí 	
			-jquey ajax trao đổi dữ liệu lọc sản phẩm, tìm kiếm, phân trang			
		Xem giỏ hàng đã mua	
			-localstorage lưu giỏ hàng: thêm vào giỏ, xóa, sửa số lượng			
		Xem thông tin cá nhân,sửa, đổi mật khẩu
			-xem danh sách hóa đơn đã mua, xem chi tiết, tải pdf, gửi mail	-jquery, ajax, servlet: cho phép sửa tên , mật khẩu, check mật khẩu cũ 
			-jsp servlet hiển thị danh sách hóa đơn			
	Web quản lý	
		Quản lý nhân viên	
			-css: thư viện materialize
			-js: jquery, ajax
			-jsp, servlet
			Xem danh sách nhân viên: 
				tìm kiếm theo nhiều tiêu chí, phân trang
				Thêm, sửa sử dụng cùng 1 trang update: tự tạo mã nhân viên khi thêm mới; xóa sản phẩm			
			Đăng nhập tài khoản	-jquery ajax trao đổi dữ liệu
				-mã hóa mật khẩu md5 khi lưu vào database
				-HttpSession để lưu user đã đăng nhập thành công			
		Quản lý sản phẩm	
			-css: thư viện materialize
			-js: jquery, ajax
			-jsp, servlet
			Xem danh sách sản phẩm: 
				tìm kiếm theo nhiều tiêu chí, phân trang
				Thêm, sửa sử dụng cùng 1 trang update: tự tạo mã sản phẩm khi thêm; xóa sản phẩm			
		Thống kê	
			-css: thư viện materialize
			- js: jquery, chart, ajax 
			- jsp, servlet
			Thống kê doanh thu bán theo ngày tháng, sản phẩm bán nhiều nhất trong tháng			
		Thống kê hóa đơn	
			-css: thư viện materialize
			- js: jquery, ajax
			- jsp, servlet
			Xem thông tin tất cả hóa đơn, xem chi tiết từng hóa đơn			
		Phân quyền người dùng	
			HttpSession lấy dữ liệu khi đăng nhập để phân quyền			

