import  java.net.*;
public class MyAdd {
    public static void main(String[] args)throws UnknownHostException {
         InetAddress me = InetAddress.getLocalHost();
         String DottedAbc= me.getHostAddress();
        System.out.println("My address is "+DottedAbc);
    }
}
