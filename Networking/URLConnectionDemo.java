import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class URLConnectionDemo
{
	public static void main(String a[])
	{
		try
		{
			URL url = new URL("http://www.internic.net");
			URLConnection urlcon = url.openConnection();
			InputStream stream = urlcon.getInputStream();
			System.out.println(urlcon.getContentType());
			System.out.println(urlcon.getContentLength());
			System.out.println(new Date(urlcon.getDate()));
			System.out.println(new Date(urlcon.getExpiration()));
			System.out.println(urlcon.getHeaderField(2));
			System.out.println(urlcon.getHeaderField("Last-Modified"));
			System.out.println(urlcon.getHeaderFieldKey(2));
			System.out.println(new Date(urlcon.getLastModified()));
			Map<String,List<String>> headers = urlcon.getHeaderFields();
			Set<Map.Entry<String,List<String>>> entrySet = headers.entrySet();
			for(Map.Entry<String,List<String>> entry : entrySet)
			{
				String headername = entry.getKey();
				System.out.println("Header Name: "+headername);
				List<String> headerValues = entry.getValue();
				for(String value : headerValues)
				{
					System.out.println("Header Value: "+value);
				}
			}
			System.out.println();
			int i;
			while((i=stream.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}