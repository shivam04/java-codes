
import java.io.File;
import java.net.MalformedURLException;


public class FiletoURL {
    public static void main(String a[]) throws MalformedURLException{
        File f = new File("F:\\aasf\\timetable.txt");
        f.toURI().toURL();
    }
}
