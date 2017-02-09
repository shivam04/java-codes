import java.io.*;
import java.net.*;
import java.util.*;
public class HttpURLConnectionDemo
{
	public static void main(String a[]) throws Exception
	{
		URL url = new URL("http://www.facebook.com");
		HttpURLConnection hurc = (HttpURLConnection)url.openConnection();
		//Display Request Method
		System.out.println("Request Method is: "+hurc.getRequestMethod());
		//Display Response Code
		System.out.println("Response code is: "+hurc.getResponseCode());
		//Display Response Message
		System.out.println("Response Message is: "+hurc.getResponseMessage());
		Map<String,List<String>> hdrMap = hurc.getHeaderFields();
		Set<String> hdrField = hdrMap.keySet();
		//Display all header keys and values.
		for(String k : hdrField)
		{
			System.out.println("Key: "+k+" Value: "+hdrMap.get(k));
		}
	}
}