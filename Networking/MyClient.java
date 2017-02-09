import java.io.*;
import java.net.*;
import java.util.*;
public class MyClient
{
	public static void main(String[] args)
	{
		try
		{
			Socket s = new Socket("localhost",6666);
			System.out.println("Server Address: "+s.getInetAddress());
			System.out.println("Remote Address: "+s.getRemoteSocketAddress());
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			Scanner sc = new Scanner(System.in);
			String message = sc.nextLine();
			dos.writeUTF(message);
			System.out.println(din.readUTF());
			dos.flush();
			dos.close();
			s.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}