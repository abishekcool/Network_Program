import java.net.*;
import java.io.*;
// define a public class named Server
public class Server {
    // add the "throws UnknownHostException" to the main method to handle possible exceptions
    public static void main(String args[]) throws Exception, UnknownHostException {
// create a server socket that listens on port 1080
        ServerSocket ss = new ServerSocket(1080);
        ss.setSoTimeout(50000);
// accept a client connection and get the corresponding socket
        Socket s = ss.accept();
// create input and output streams to communicate with the client
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
// create a buffered reader to read input from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// initialize two strings to be used in the loop condition and message exchange
        String str = "", str2 = "";
// loop until the client sends the string "stop"
        while (!str.equals("stop")) {
// wait for a message from the client and print it to the console
            System.out.println("Waiting for client's Reply...");
            str = din.readUTF();
            System.out.println("Client: " + str);
// prompt the user to enter a message and read the input
            System.out.println("Enter Message:");
            str2 = br.readLine();
// send the input to the client through the output stream
            dout.writeUTF(str2);
            dout.flush();
        }
// close the input stream, the socket, and the server socket when the loop ends
        din.close();
        s.close();
        ss.close();
    }
}