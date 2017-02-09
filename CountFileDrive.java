import java.util.*;
import java.io.*;
class CountFileDrive
{
	static int count = 0;
	static void traverse(File f,String file) 
	{
		String fn[] = f.list();
		for(int i=0;i<fn.length;i++)
		{
			if(fn[i].equals("System Volume Information"))
				continue;
			File s_f = new File(f.getPath()+"\\"+fn[i]);
			if(file.equals(fn[i]))
			{
				count+=1;
			}
			if(s_f.isDirectory())
			{
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
					if(fn[j].equals("System Volume Information"))
						continue;
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
							traverse(fv,file);
					}
				}
				break;
			}
		}
		System.out.println("Number of file "+file+" is "+count);
	}
}