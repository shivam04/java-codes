class Base
{
	public static void display()
	{
		System.out.println("Static Block Base Class");
	}
	public void print()
	{
		System.out.println("Non-Static Block Base Class");
	}
}
class Derived extends Base
{
	public static void display()
	{
		System.out.println("Static Block Derived Class");
	}
	public void print()
	{
		System.out.println("Non-Static Block Derived Class");
	}
}
class staticInherit
{
	public static void main(String a[])
	{
		Base b1 = new Derived();
		b1.display();
		b1.print();
		Derived d1 = new Derived();
		d1.display();
		d1.print();
		Base b2 = new Base();
		b2.display();
		b2.print();
		/*Derived d2 = new Base();
		d2.display();
		d2.print();*/
	}
}
