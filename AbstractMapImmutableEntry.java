import java.util.*;
class AbstractMapImmutableEntryDemo
{
	public static void main(String a[])
	{
		AbstractMap.SimpleImmutableEntry<String,String> se = new AbstractMap.SimpleImmutableEntry<String,String>("1","Apple");
		System.out.println(se.getKey());
		System.out.println(se.getValue());
		se.setValue("orange");			//Exception since Apple and orange are tried to be stored in same key i.e 1
		System.out.println(se.getKey());
		System.out.println(se.getValue());
	}
}