import java.net.MalformedURLException;
import java.net.URL;

public class RelativeURL {

  public static void main(String[] a) {

    try {
      URL base = new URL("http://www.java2s.com/java");
      URL relative = new URL(base, "0320__Network/RelativeURL.htm");
      System.out.println(relative);
    } catch (MalformedURLException ex) {
      ;
    }

  }

}