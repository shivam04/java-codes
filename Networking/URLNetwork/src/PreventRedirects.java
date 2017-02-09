
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


public class PreventRedirects {
    public static void main(String a[]) throws Exception{
        HttpURLConnection.setFollowRedirects(false);
        URL url = new URL("http://hostname:80");
        URLConnection conn = url.openConnection();
        HttpURLConnection httpConn = (HttpURLConnection)conn;
        httpConn.setInstanceFollowRedirects(false);
        conn.connect();
    }
}
