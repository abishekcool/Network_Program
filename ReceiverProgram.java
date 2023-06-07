
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.DatagramChannel;
public class ReceiverProgram {
    public static void main(String[] args) throws Exception {
        DatagramChannel channel=DatagramChannel.open();
        /*Open the datagram channel by received to received msg */
        InetSocketAddress receiverAddress = new InetSocketAddress("Localhost", 1234);
        channel. bind(receiverAddress);/*Byte buffer allocated(1024)*/
        /*create a BYteBuffer of size to receiver to msg */
        ByteBuffer buffer=ByteBuffer.allocate(1024);
        channel.receive(buffer);
        buffer.flip();
        byte[] receiveData = new byte[buffer.remaining()];
        /*create the byte array with a received data*/
        buffer.get(receiveData);
        /*Convert the byte array to a string to extract the msg*/
        String message = new String(receiveData);
        System.out.println("Received message" + message);
    }
}