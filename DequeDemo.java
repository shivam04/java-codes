import java.util.*;
class DequeDemo
{
	public static void main(String a[])
	{
		Deque obj = new ArrayDeque();
		obj.add("Hello");
		obj.addFirst("Yo yo");
		obj.offerFirst("Hey");
		obj.offerLast("Hi!");
		System.out.println("First Element: "+obj.getFirst());
		System.out.println("Last Element: "+obj.peekLast());
		System.out.println("Remove First Element: "+obj.pollFirst());
		System.out.println("Remove Last Element: "+obj.removeLast());
		Iterator i = obj.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}