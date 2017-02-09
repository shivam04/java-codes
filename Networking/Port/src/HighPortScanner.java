import java.net.InetAddress;
import java.net.Socket;

public class HighPortScanner {

  public static void main(String[] args) {

    String host = "localhost";

    try {
      InetAddress theAddress = InetAddress.getByName(host);
      for (int i = 1024; i < 65536; i++) {
        Socket theSocket = new Socket(theAddress, i);
        System.out.println("There is a server on port " + i + " of " + host);
      }
    } catch (Exception ex) {
      System.err.println(ex);
    }

  }

}