import java.net.*;
import java.io.*;
public class MIME {
    public static void main(String[] args) {
        String fileName = "example.jpg";
        String contextType = URLConnection.guessContentTypeFromName(fileName);
        System.out.println("File name " + contextType);
    }
}
