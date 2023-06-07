import java.net.UnknownHostException;
import java.net.InetAddress;

public class TwoHostname {
    public static void main(String[] args) throws UnknownHostException { // main methods
        InetAddress Obj1 = InetAddress.getByName("www.southwestern.edu.np");
        //InetAdd obj called "Obj1" by looking up the IP address of hostname "www.eg.com
        InetAddress Obj2 = InetAddress.getByName("southwestern.edu.np");
        boolean x= Obj1.equals(Obj2);
        System.out.println("Both are EQUAL "+ x);// print result and called boolean variable

    }
}
