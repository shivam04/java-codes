import java.util.*;
class PriorityQueueDemo
{
	public static void main(String a[])
	{
		PriorityQueue<String> ob = new PriorityQueue<String>();
		ob.offer("Shivam");
		ob.offer("Shubham");
		ob.offer("Adarsh");
		ob.offer("Saurabh");
		//ob.offer("Suddhant");
		System.out.println(ob.comparator());   //natural odering
		System.out.println("1."+ob.poll());
		System.out.println("2."+ob.poll());
		System.out.println("3."+ob.peek());
		System.out.println("4."+ob.peek());
		System.out.println("5."+ob.remove());
		System.out.println("6."+ob.remove());
		System.out.println("7."+ob.peek());
		System.out.println("8."+ob.element());
	}
}