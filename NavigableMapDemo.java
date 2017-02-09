import java.util.*;
import java.util.concurrent.*;
class NavigableMapDemo
{
	public static void main(String a[])
	{
		NavigableMap ob = new ConcurrentSkipListMap();
		ob.put(1,"Banana");
		ob.put(2,"Apple");
		ob.put(3,"Mango");
		Map.Entry me = ob.lowerEntry(5);
		System.out.println("Key "+me.getKey());
		System.out.println("Value "+me.getValue());
	}
}