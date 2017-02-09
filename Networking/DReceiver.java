import java.net.*;
import java.util.*;
public class DReceiver
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int port = sc.nextInt();
		DatagramSocket ds = new DatagramSocket(port);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		ds.receive(dp);
		//System.out.println(dp);
		String str = new String(dp.getData(),0,dp.getLength());
		System.out.println(str);
	}
}