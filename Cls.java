import java.net.*;
public class Cls {


    public static void main(String[] args) throws UnknownHostException{

        InetAddress Ip = InetAddress.getByName("47.71.110.88");
        System.out.println(Ip.getCanonicalHostName());
    }
}
