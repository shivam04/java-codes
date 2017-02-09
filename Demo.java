public class Demo
{
	static int n;
	void increment()
	{
		n++;
	}
	void display()
	{
		System.out.println("Value of n "+n);
	}
	public static void main(String a[])
	{
		Demo d = new Demo();
		d.n++;
		Demo e = new Demo();
		e.n=20;
		d.increment();
		e.n++;
		d.n++;
		d.display();
		e.display();
	}
}