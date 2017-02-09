import java.util.*;
import java.io.*;
class checkfile
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
				if(s_f.list().length!=0)
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
		File f[] = File.listRoots();
		drive = drive+":\\";
		for(int i=0;i<f.length;i++)
		{
			if(drive.equals(f[i].getPath()))
			{
				String fn[]=f[i].list();
				for(int j=0;j<fn.length;j++)
				{
					String path = f[i].getPath()+fn[j];
					//System.out.println(fn[j]);
					File fv = new File(path);
					//System.out.println(fv.getPath());
					if(file.equals(fn[j]))
					{
						count+=1;
					}
					if(fv.isDirectory())
					{
						System.out.println(fv.getPath());
						String list[] = fv.list();
						System.out.println(list.length);
						for(int k=0;k<list.length;k++)
						{
								System.out.println(list[k]);
						}
					}
				}
				break;
			}
		}
		System.out.println("Number of file "+file+" is "+count);
	}
}