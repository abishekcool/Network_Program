import java.net.*;
import java.io.*;

public class URLConnectionEg {
    public static void main(String[] args)throws Exception {
    URL url=new URL("http://www.example.com");
    URLConnection connection= url.openConnection();
    InputStream stream=connection.getInputStream();
    BufferedReader reader=new BufferedReader(new InputStreamReader(stream));
    String Line;
    while((Line=reader.readLine())!=null){
        System.out.println(Line);
         }
        reader.close();
    }
}
