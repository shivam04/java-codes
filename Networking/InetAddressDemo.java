import java.net.*;
class InetAddressDemo
{
	public static void main(String args[])throws UnknownHostException
	{
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address);
		address = InetAddress.getByName("osborne.com");
		System.out.println(address);
		System.out.println("Host Name: "+address.getHostName());
		System.out.println("IP Address: "+address.getHostAddress());
		InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
		for(int i=0;i<SW.length;i++)
			System.out.println(SW[i]);
	}
} 