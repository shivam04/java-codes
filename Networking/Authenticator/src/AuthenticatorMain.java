
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;


public class AuthenticatorMain {
    public static void main(String[] args) throws Exception{
        Authenticator.setDefault(new DialogAuthenticator());
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
class DialogAuthenticator extends Authenticator{
    public DialogAuthenticator(){
        
    }
    @Override
    public PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication("username", "password".toCharArray());
    }
}
