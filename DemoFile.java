import java.io.*;
class DemoFile
{
	public static void main(String a[])
	{
		File f[] = File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i].getPath());
		}
	}
}