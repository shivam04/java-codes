import java.util.*;
class CollectionDemo
{
	public static void main(String a[])
	{
		List<String> l = new ArrayList<String>();
		for(int i=0;i<=10;i++)
		{
			l.add("Value is: "+new Integer(i));
		}
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		l.set(5,"Hello World");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		l.clear();
		System.out.println(l.size());
	}
}