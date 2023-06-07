import java.net.*;
import java.net.Socket;
import java.io.*;
public class LocalPostScanner {
    public static void main(String[] args){
    String host="localhost";
        for(int port=1;port<=65535;port++) {
            try{
                Socket mysoc = new Socket (host, port);
                System.out.println("There is a server on port"+port);
                mysoc.close();
            }
            catch(UnknownHostException e) {
                System.err.println(e);
                break;
            }catch (IOException e){

            }
        }
    }
}