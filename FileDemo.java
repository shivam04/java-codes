import java.util.*;
import java.io.*;
class FileDemo
{
	static void traverse(File f)
	{
		String fn[] = f.list();
		for(int i=0;i<fn.length;i++)
		{
				System.out.println(fn[i]);
				File s_f = new File(f.getPath()+"\\"+fn[i]);
				if(s_f.isDirectory())
				{
					traverse(s_f);
				}
		}
	}
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		File f = new File(path);
		traverse(f);
	}
}