import java.io.*;
class CompileC
{
	public static void main(String a[])throws Exception
	{
		Runtime r = Runtime.getRuntime();
		String path = "C:\\Java\\demo.c";
		r.exec("C:\\Program Files (x86)\\Dev-Cpp\\MinGW64\\bin\\gcc.exe "+path);
		Process p = Runtime.getRuntime().exec("a.exe");
		InputStream in = p.getInputStream();
		DataInputStream din = new DataInputStream(in);
		String s = " ";
		while((s=din.readLine())!=null)
		{
			System.out.println(s);
		}
		din.close();
	}
}