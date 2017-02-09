
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class BufferedReader {
    public static void main(String a[])throws Exception{
        URL u = new URL("http://www.java2s.com");
        HttpURLConnection urc = (HttpURLConnection)u.openConnection();
        int code = urc.getResponseCode();
        String response = urc.getResponseMessage();
        System.out.println("HTTP/1.x "+code+" "+response);
        for(int j=1;;j++){
            String header = urc.getHeaderField(j);
            String key = urc.getHeaderFieldKey(j);
            if(header==null||key==null)
                break;
            System.out.println(urc.getHeaderFieldKey(j)+": "+header);
        }
        InputStream in = new BufferedInputStream(urc.getInputStream());
        Reader r = new InputStreamReader(in);
        FileWriter f = new FileWriter("java2s.html");
        int c;
        while((c=r.read())!=-1)
        {
            f.write((char)c);
            System.out.print((char)c);
        }
    }
}
