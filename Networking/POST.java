import java.net.*;
import java.io.*;
public class POST
{
	public static void main(String a[]) throws Exception
	{
		URL url = new URL("http://localhost/login-out/avai.php");
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
		String data = URLEncoder.encode("username","UTF-8")+"="+URLEncoder.encode("shivam","UTF-8");
		data+="&"+URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode("abc","UTF-8");
		urlcon.setDoOutput(true);
		OutputStreamWriter out = new OutputStreamWriter(urlcon.getOutputStream());
		out.write(data);
		out.flush();
		InputStream stream = urlcon.getInputStream();
		int i;
		while((i=stream.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}