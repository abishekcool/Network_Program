import java.net.*;

public class TimeOut {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://www.example.com");
            URLConnection uc = u.openConnection();
            uc.setConnectTimeout(30000);
            uc.setReadTimeout(50000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}