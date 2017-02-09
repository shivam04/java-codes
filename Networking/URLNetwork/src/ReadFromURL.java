
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;


public class ReadFromURL {
    public static void main(String a[])throws Exception{
        URL u =new URL("http://www.java2s.com");
        InputStream in = u.openStream();
        in = new BufferedInputStream(in);
        Reader r = new InputStreamReader(in);
        int c;
        while((c=r.read())!=-1){
            System.out.print((char)c);
        }
    }
    
}
