import java.io.InputStream;
import java.net.Socket;

public class TimeClient {
  public static void main(String[] args) throws Exception {

    String hostname = "time.nist.gov";
    int port = 37;

    InputStream raw = null;
    Socket theSocket = new Socket(hostname, port);
    raw = theSocket.getInputStream();

    System.out.println(raw.read());

    raw.close();
  }

}
