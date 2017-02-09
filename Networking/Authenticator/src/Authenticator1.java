
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.PasswordAuthentication;
import java.net.URL;


public class Authenticator1 {
    public static void main(String[] a)throws Exception{
        Authenticator.setDefault(new MyAuthenticator());
        URL u = new URL("http://localhost/webkriti1");
        InputStream in = u.openStream();
        in = new BufferedInputStream(in);
        Reader r = new InputStreamReader(in);
        int c;
        while((c=r.read())!=-1){
            System.out.print((char)c);
        }
    }
}
class MyAuthenticator extends Authenticator{
    @Override
    protected PasswordAuthentication getPasswordAuthentication(){
        String promptString = getRequestingPrompt();
        System.out.println(promptString);
        String hostname = getRequestingHost();
        System.out.println(hostname);
        InetAddress ipaddr = getRequestingSite();
        System.out.println(ipaddr);
        int port = getRequestingPort();
        System.out.println(port);
        String username = "name";
        String password = "password";
        return new PasswordAuthentication(username, password.toCharArray());
    }
}

