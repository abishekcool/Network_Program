//WAp to display a socket information [Add,port,local Add,local port].
import java.net.*;
import java.io.*;
public class SocketInfo {
    public static void main(String[] args) {
        try {
            Socket soc = new Socket("www.southwestern.edu.np", 443);
            // create a new Socket object (soc) and connected to www.example.com
            //connected to a fixed host & port so doesn't need any command line argument
            System.out.println("Connected To " + soc.getInetAddress() + "on port " + soc.getPort()+
                    " from port " +soc.getLocalPort()+ " of " + soc.getLocalAddress());
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
}
