import java.net.*;
import java.nio.*;
import java.nio.channels.DatagramChannel;

public class SenderProgram {
     public static void main(String[] args) throws Exception {
            DatagramChannel channel=DatagramChannel.open();
            /* open a datagram channel for sending msg */
            String manage= "Hello Reserve";/*create the msg to be send*/
            ByteBuffer buffer= ByteBuffer.wrap(manage.getBytes());
            /*wrap the msg in a bytebuffer */
            InetSocketAddress receiverAddress = new InetSocketAddress("localhost",1234);
            /*create the receiver address */
            channel.send(buffer, receiverAddress);/*send the msg to the receiver*/
            System.out.println("Good Morning" );

        }
    }
