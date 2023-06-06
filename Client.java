import java.net.*; // import the java.net package for network-related classes
import java.io.*; // import the java.io package for input and output-related classes
public class Client {

    // define a public class called "Client"
        public static void main(String[] args) throws Exception { // define the main method that throws anException

            Socket s = new Socket("localhost", 1080); // create a new socket with the host "localhost" and port 1080

            // create data input and output streams to read and write data to and from the socket
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // create a new buffered reader to read input from the user

            String str = "", str2 = ""; // initialize two strings to hold data

            while (!str.equals("stop")) { // continue looping until the user types "stop"

                System.out.println("\n Enter Response: "); // prompt the user for input

                str = br.readLine(); // read input from the user

                dout.writeUTF(str); // write the input to the output stream

                dout.flush(); // flush the output stream

                System.out.println("Waiting for Server's Reply..."); // display a message indicating that the program is waiting for a response from the server

                str2 = din.readUTF(); // read the response from the input stream

                System.out.println("Server says: " + str2); // display the response from the server
            }
            dout.close(); // close the data output stream

            s.close(); // close the socket
        }
    }