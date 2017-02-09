import java.util.*;
class NavigableSetDemo
{
	public static void main(String a[])
	{
		NavigableSet<String> ob = new TreeSet();
		ob.add("Banana");
		ob.add("Apple");
		ob.add("Mango");
		System.out.println("Ascending Order : "+ob);
		Iterator<String> descend = ob.descendingIterator();
		while(descend.hasNext())
			System.out.println(descend.next());
		System.out.println("Retrieving and Removing First and Last Element: ");
		System.out.println("First Element: "+ob.pollFirst());
		System.out.println("Last Element: "+ob.pollLast());
	}
}