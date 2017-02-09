
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class Client implements Runnable{
    static Socket socket=null;
    static PrintStream dos;
    static BufferedReader din=null;
    static BufferedReader urip=null;
    static boolean flag=false;
    //static String userip;
    public static void main(String args[]) throws IOException{
        try{
            socket = new Socket("localhost",9635);
            urip = new BufferedReader(new InputStreamReader(System.in));
            din = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            dos = new PrintStream(socket.getOutputStream());
        }catch(Exception e){
            System.out.println("Unknown Host localhost");
        }
        if(socket!=null){
            try{
                new Thread(new Client()).start();
                while(!flag){
                    dos.println(urip.readLine());
                }
                dos.close();
                din.close();
                socket.close();
            }catch(Exception e){
                System.out.println("IOExceptionE");
            }
        }
    }
    @Override
    public void run(){
        String msg;
        try {
            while((msg=din.readLine())!=null)
                System.out.println(msg);
                flag=true;
        } catch (Exception ex) {
            System.out.println("IOException");
        }
    }
}
