import java.net.*;
public class ip {
    public static void main(String[] args)throws UnknownHostException{
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
    }
}

