package p.pack;
public class p2
{
	public void printHello()
	{
		System.out.println("Hello World");
	}
	public static p1 throwp1()
	{
		(new p1()).printHello();
	}
}