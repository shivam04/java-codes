import java.awt.Image;
import java.awt.Toolkit;
import java.io.InputStream;
import java.net.URL;

public class ImageFromURL {
  public static void main(String[] argv) throws Exception {
    URL url = new URL("http://vignette2.wikia.nocookie.net/tomandjerry/images/b/bd/TomCatHeader.PNG/revision/latest?cb=20130813013330");
    Image image = Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(url);
    //InputStream is = new url.openStream();
  }
}