import java.util.*;
import java.io.*;
class CountAll
{
	static int count = 0;
	static void traverse(File f,String file)
	{
		String fn[] = f.list();
		for(int i=0;i<fn.length;i++)
		{
			File s_f = new File(f.getPath()+"\\"+fn[i]);
			if(file.equals(fn[i]))
			{
				count+=1;
			}
			if(s_f.isDirectory())
			{
				if(s_f.list()!=null)
					traverse(s_f,file);
			}
		}
	}
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Drive: ");
		String drive = sc.nextLine();
		System.out.println("Enter Filename: ");
		String file = sc.nextLine();
		File f = new File(drive+":");
		traverse(f,file);
		System.out.println("Number of file "+file+" is "+count);
	}
}