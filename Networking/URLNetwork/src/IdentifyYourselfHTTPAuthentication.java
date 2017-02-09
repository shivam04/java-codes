
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class IdentifyYourselfHTTPAuthentication {
    public static void main(String a[])throws Exception{
        URLConnection con = new URL("http://www.yourserver.com").openConnection();
        con.setDoInput(true);
        con.setRequestProperty("Authorization", "asdfasdf");
        con.connect();
        InputStream in = con.getInputStream();
    }
}
