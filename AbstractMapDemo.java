import java.util.*;
class AbstractMapDemo
{
	public static void main(String a[])
	{
		AbstractMap.SimpleEntry<String,String> se = new AbstractMap.SimpleEntry<String,String>("1","Apple");
		System.out.println(se.getKey());
		System.out.println(se.getValue());
		se.setValue("orange");
		System.out.println(se.getKey());
		System.out.println(se.getValue());
	}
}