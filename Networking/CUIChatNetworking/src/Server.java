
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    static ServerSocket ss=null;
    static Socket s = null;
    static ClientThread th[]=new ClientThread[10];
    public static void main(String args[]){
        System.out.println("Server started...");
        System.out.println("[Press Ctrl C to terminate ]");
        try{
            ss = new ServerSocket(9635);
        }catch(Exception e){
            System.out.println("Exception For Input/Output1");
        }
        while(true){
            try{
                s = ss.accept();
                for(int i=0;i<10;i++){
                    if(th[i]==null){
                        (th[i]= new ClientThread(s,th)).start();
                        break;
                    }
                }
            }catch(Exception e){
                System.out.println("Exception for Input/Output2");
            }
        }
    }
    
}
class ClientThread extends Thread{
    BufferedReader din=null;
    PrintStream dos = null;
    Socket s;
    ClientThread th[];
    public ClientThread(Socket s, ClientThread[] th){
        this.s=s;
        this.th=th;
    }
    @Override
    public void run(){
        String uname;
        String msg;
        try{
            din = new BufferedReader(new InputStreamReader(s.getInputStream()));
            dos = new PrintStream(s.getOutputStream());
            dos.println("What is your name?Enter it-");
            uname = (String)din.readLine();
            dos.println(uname+": Welcome to chat room");
            dos.println("To leave chat room type $$");
            for(int i=0;i<=9;i++){
              if(th[i]!=null&&th[i]!=this){
                  th[i].dos.println("--------------A new user arrived in chat room: "+uname);
              }
            }
              while(true){
                  msg = din.readLine();
                  if(msg.startsWith("$$"))
                      break;
                  for(int k=0;k<=9;k++){
                      if(th[k]!=null)
                          th[k].dos.println("<"+uname+"> "+msg);
                  }
              }
              for(int k=0;k<=9;k++){
                  if(th[k]!=null&&th[k]!=this)
                      th[k].dos.println("------A user Leaving chat Room:" + uname + "--------");
              }
              dos.println("Press Ctrl C to return to prompt");
              for (int j = 0; j <= 9; j++){
                if (th[j] == this)
                    th[j] = null;
              }
              din.close();
              dos.close();
              s.close();
        }catch (Exception e){
            System.out.println("Exception for Input/Output3"+e);
        }
    }
}
