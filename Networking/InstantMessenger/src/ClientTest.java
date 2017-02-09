import javax.swing.JFrame;
public class ClientTest {
    public static void main(String a[]){
        Client charlie;
        charlie = new Client("192.168.68.82");
        charlie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        charlie.startRunning();
    }
}
