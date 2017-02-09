import java.io.*;
import java.net.*;
public class MyServer
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket ss = new ServerSocket(6666);
			System.out.println("Server Socket");
			Socket s = ss.accept();
			System.out.println("Server Address: "+s.getInetAddress());
			System.out.println("Remote Address: "+s.getRemoteSocketAddress());
			System.out.println("Socket");
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			String str = (String)din.readUTF();
			str="Hello "+str;
			dos.writeUTF(str);
			ss.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}