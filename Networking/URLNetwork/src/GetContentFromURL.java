
import java.net.URL;


public class GetContentFromURL {
    public static void main(String a[]){
        try{
            URL u = new URL("http://www.java2s.com");
            Object o = u.getContent();
            System.out.println("I got a "+o.getClass().getName());
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
