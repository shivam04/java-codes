import java.io.*;
import java.net.*;
public class Server
{
static ServerSocket server=null;
static Socket socket=null;
static ClientThread th[]=new ClientThread[10];
public static void main(String args[])
{
int port=1234;
System.out.println("Server started...");
System.out.println("[Press Ctrl C to terminate ]");
try
{
server=new ServerSocket (port);
}
catch(IOException e)
{
System.out.println("Exception for Input/Output");
}
while(true)
{
try
{
socket=server.accept();
for(int i=0;i<=9;i++)
{
if(th[i]==null)
{
(th[i]=new ClientThread(socket,th)).start();
break;
}
}
}
catch(IOException e)
{
System.out.println("Exception for Input/Output");
}
}
}
}
class ClientThread extends Thread
{
BufferedReader input=null;
PrintStream output=null;
Socket socket=null;
ClientThread th[];
public ClientThread(Socket socket,ClientThread[] th)
{
this.socket=socket;
this.th=th;
}
public void run()
{
String msg;
String username;
try
{
input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
output = new PrintStream(socket.getOutputStream());
output.println("What is your Name?Enter it-");
username = input.readLine();
output.println(username + ":Welcome to chat room.");
output.println("To leave chat room type $$");
for (int i = 0; i <= 9; i++)
if (th[i] != null && th[i] != this)
th[i].output.println("------------A new user arrived in chat Room:" + username);
while (true)
{
msg = input.readLine();
if (msg.startsWith("$$"))
break;
for (int i = 0; i <= 9; i++)
if (th[i] != null)
th[i].output.println("<" + username + ">" + msg);
}
for (int k = 0; k <= 9; k++)
if (th[k] != null && th[k] != this)
th[k].output.println("------A user Leaving chat Room:" + username + "--------");
output.println("Press Ctrl C to return to prompt---");
for (int j = 0; j <= 9; j++)
if (th[j] == this)
th[j] = null;
input.close();
output.close();
socket.close();
}
catch (IOException e)
{
System.out.println("Exception for Input/Output");
}
}
}