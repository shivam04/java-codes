import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.io.*;
//  www .ja  va 2  s.co  m
public class URLReader_Writer {
  public static String getURLContent(String urlStr)
      throws Exception {
    URL url = new URL(urlStr);
    URLConnection connection = url.openConnection();
    connection.setDoOutput(true);
    connection.connect();
    OutputStream ous = connection.getOutputStream();
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(ous));
    bw.write("index.htm");
    bw.flush();
    bw.close();

    printRequestHeaders(connection);
    InputStream ins = connection.getInputStream();
	FileWriter out = new FileWriter("url.txt");
    //BufferedReader br = new BufferedReader(new InputStreamReader(ins));
    StringBuffer sb = new StringBuffer();
    //String msg = null;
	int c;
    while ((c = ins.read()) != -1) {
	  out.write((char)c);
      sb.append((char)c);
      sb.append("\n"); // Append a new line
    }
   // br.close();
    return sb.toString();
  }
  public static void printRequestHeaders(URLConnection connection) {
    Map headers = connection.getHeaderFields();
    System.out.println(headers);
  }
  public static void main(String[] args) throws Exception {
    String urlStr = "http://www.java2s.com";
    String content = getURLContent(urlStr);
    System.out.println(content);
  }
}