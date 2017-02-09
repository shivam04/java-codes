import java.util.*;
class LinkedListDemo
{
	public static void main(String a[])
	{
		LinkedList<String> ll = new LinkedList<String>();
		while(true)
		{
			System.out.println("Enter Name to Insert: ");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			ll.add(name);
			System.out.println("Enter Yes or No:");
			String decision = sc.nextLine();
			if(decision.equals("No"))
				break;
		}
		System.out.println(ll.size());
	}
}