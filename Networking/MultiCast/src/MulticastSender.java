
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;


public class MulticastSender {
    public static void main(String[] args)throws Exception{
        int port = 0;
        byte ttl = (byte)1;
        InetAddress ia = InetAddress.getByName("127.0.0.1");
        byte[] data = "Here's some multicast data\r\n".getBytes();
        DatagramPacket dp = new DatagramPacket(data,data.length, ia, port);
        MulticastSocket ms = new MulticastSocket();
        ms.joinGroup(ia);
        for(int i=1;i<10;i++){
            ms.send(dp, ttl);
        }
        ms.leaveGroup(ia);
        ms.close();
    }
}
