import java.util.*;
class sortString
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			char[] a = new char[1005];
			char[] b = new char[1005];
			char[] c = new char[1005];
			int m=0;
			a = sc.nextLine().toCharArray();
			b = sc.nextLine().toCharArray();
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						c[m]=a[i];
						m++;
						break;
					}
				}
			}
			Arrays.sort(c);
			System.out.printf("%s\n",c);
		}
	}
}