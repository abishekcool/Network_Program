import java.net.*;
public class Split{
    public static void main(String[] args) {
        try{
        URL u1 = new URL("https://www.example.com:443/anything/thispage.html/?param1=value#here");
        URL u = new URL ("ftp://admin@blackstar.com:21 ");
        System.out.println("File : " + u1.getFile());
        System.out.println("host : " +u1.getHost());
        System.out.println("Port : " +u1.getPort());
        System.out.println("Path : " +u1.getPath());
        System.out.println("Ref :" +u1.getRef());
        System.out.println("Query : " +u1.getQuery());
        System.out.println("UserInfo :" +u1.getUserInfo());
        System.out.println("Protocol : "  +u1.getProtocol());
        System.out.println("Authority : " +u1.getAuthority());



            System.out.println("");
            System.out.println("File : " + u.getFile());
            System.out.println("host : " +u.getHost());
            System.out.println("Port : " +u.getPort());
            System.out.println("Path : " +u.getPath());
            System.out.println("Ref :" +u.getRef());
            System.out.println("Query : " +u.getQuery());
            System.out.println("UserInfo :" +u.getUserInfo());
            System.out.println("Protocol : "  +u.getProtocol());
            System.out.println("Authority : " +u.getAuthority());
    }
        catch(Exception e){
        }
    }
}