import java.io.IOException;
import  java.net.*;

public class HeaderVIewer {
    public static void main(String[] args) throws IOException {
        URL u = new URL( "https://southwestern.edu.np/bca/");
        URLConnection uc= u.openConnection();
                System.out.println("Content type : " +uc.getContentType());

        System.out.println("Content Encoding : " +uc.getContentEncoding());

        System.out.println("Content Length : " +uc.getContentLength());

        System.out.println("Content Date : " +uc.getDate());

        System.out.println("Content LastModified  : " +uc.getLastModified());

        System.out.println("Content Expiration : " +uc.getExpiration());
    }
}
