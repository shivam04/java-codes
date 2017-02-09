import java.io.*;
import java.net.*;
public class MyClientRW
{
	public static void main(String[] args)
	{
		try
		{
			Socket s = new Socket("localhost",3333);
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str1="",str2="";
			while(!str1.equals("stop"))
			{
				str1=br.readLine();
				dos.writeUTF(str1);
				dos.flush();
				str2=dis.readUTF();
				System.out.println("server says: "+str2);
			}
			dos.close();
			s.close();
		}
		catch(Exception e){}
	}
}