import java.net.*;
import java.io.*;
public class URLDemo
{
	public static void main(String a[]) throws Exception
	{
		URL url = new URL("http://www.javatpoint.com/java-tutorial");
		System.out.println("Protocol: "+url.getProtocol());
		System.out.println("Host Name: "+url.getHost());
		System.out.println("Port: "+url.getPort());
		System.out.println("File Name: "+url.getFile());
	}
}