import java.net.*;
import java.net.UnknownHostException;
public class HostnameIP {
    public static void main(String[] args) {
        try {
            // get the local host
            InetAddress LocalHost = InetAddress.getLocalHost();
            // get the HOSTNAME
            String hostname = LocalHost.getHostName();
            System.out.println("Hostname " + hostname);

            // get IP Address
            String ipAddress = LocalHost.getHostAddress();
            System.out.println("IP Address : " + ipAddress);
        }catch (UnknownHostException e){

            //if there is an ex thrown , print the stack trace
            e.printStackTrace();
        }
    }

}

