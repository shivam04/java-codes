
import java.net.URL;
import java.net.URLConnection;


public class SendaCookie  {
    public static void main(String[] argv)throws Exception{
        URL url = new URL("http://hostname:80");
        URLConnection conn = url.openConnection();
        conn.setRequestProperty("Cookie", "name1=value1;name2=value2");
        conn.connect();
    }
}
