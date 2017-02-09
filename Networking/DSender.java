import java.net.*;
public class DSender
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket ds = new DatagramSocket();
		String str = "Welcome java";
		while(true){
		InetAddress ip = InetAddress.getByName("localhost");
		byte[] b = str.getBytes();
		DatagramPacket dp = new DatagramPacket(b,b.length,ip,3000);
		//System.out.println(ip+" "+dp.getPort());
		ds.send(dp);
		}
	}
}