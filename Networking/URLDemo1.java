import java.net.*;
import java.io.*;
public class URLDemo1
{
	public static void main(String a[]) throws Exception
	{
		URL url = new URL("http://localhost/webkriti1/");
		URLConnection urlcon = url.openConnection();
		System.out.println("URL: "+urlcon.getURL().toString());
		System.out.println("URL is: "+url.toString());
		System.out.println("Protocol: "+url.getProtocol());
		System.out.println("Authority is "+ url.getAuthority());
		System.out.println("Host Name: "+url.getHost());
		System.out.println("path is "+ url.getPath());
		System.out.println("Port: "+url.getPort());
		System.out.println("File Name: "+url.getFile());
		System.out.println("default port is "+ url.getDefaultPort());
		System.out.println("query is "+ url.getQuery());
		System.out.println("ref is "+ url.getRef());
		OutputStreamWriter out = new OutputStreamWriter(urlcon.getOutputStream());
		out.write("value=1&anotherValue=1");
		InputStream stream = urlcon.getInputStream();
		int i;
		while((i=stream.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}