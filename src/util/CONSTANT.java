package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CONSTANT {
    public static final String FS_ADDRESS = "Học viện Công nghệ Bưu chính Viễn thông - PTIT, KM9, Hà Đông, Hà Nội";
    public static final String FS_ADDRESS_ORGIN = "KM9, P. Mộ Lao, Hà Đông, Hà Nội, Vietnam";
    public static final Double PRICE_PER_KM = 5000d;

    public static void main(String[] args) {
        String start_dt = "2011-01-01";
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = (Date)formatter.parse(start_dt);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
