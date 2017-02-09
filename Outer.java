class Outer
{
	String a = "Hello Outer";
	static String b = "Hello static outer";
	class Inner
	{
		void display()
		{
			System.out.println("Hello Inner \n"+a);
		}
	}
	static class Inner1
	{
		void display()
		{
			System.out.println("Hello Inner1\n"+b);
		}
		static void print()
		{
			System.out.println("Static Inner1");
		}
	}
	public static void main(String a[])
	{
		//Method 1
		Outer.Inner i = new Outer().new Inner();
		i.display();
		//Method 2
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.display();
		//static class
		Outer.Inner1 in1 = new Outer.Inner1();
		in1.display();
		Outer.Inner1.print();
	}
}