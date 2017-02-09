import java.net.*;
public class getownaddress{
	public static void main(String[] args)throws Exception{
		InetAddress me = InetAddress.getLocalHost();
		String dottedQuad = me.getHostAddress();
		System.out.println(me+" MyAddress is "+dottedQuad);
	}
}