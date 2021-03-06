
import java.net.URL;
import java.net.URLConnection;


public class GettingCookie {
    public static void main(String a[])throws Exception{
        URL url = new URL("http://localhost/login-out");
        URLConnection conn = url.openConnection();
        for(int i=0;;i++){
            String headerName = conn.getHeaderFieldKey(i);
            String headerValue = conn.getHeaderField(i);
            if(headerName==null||headerValue==null)
                break;
            if("Set-Cookie".equals(headerName)){
                String[] fields = headerValue.split(";\\s*");
                for(int j=1;j<fields.length;j++){
                    if("secure".equals(fields[j]))
                        System.out.println("secure=true");
                    else if(fields[j].indexOf('=')>0){
                        String[] f = fields[j].split("=");
                        if("expires".equalsIgnoreCase(f[0])){
                            System.out.println("expires"+f[1]);
                        }else if("domain".equalsIgnoreCase(f[0])){
                            System.out.println("domain"+f[1]);
                        }else if("path".equalsIgnoreCase(f[0])){
                            System.out.println("path"+f[1]);
                        }
                    }    
                }
            }
        }
    }
}
