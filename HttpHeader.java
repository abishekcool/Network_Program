import java.net.*;
import java.io.*;
public class HttpHeader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            System.out.println("Request Methods : " + connection.getRequestMethod());
            System.out.println("Response Message: " + connection.getResponseMessage());
            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLength());
            System.out.println("Date : " + connection.getDate());
            System.out.println("Expiration date : " + connection.getExpiration());
            System.out.println("Content Encoding() : " + connection.getContentEncoding());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

