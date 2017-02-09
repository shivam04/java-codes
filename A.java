class B
{
	B()
	{
		System.out.println("Parent: No Parameter");
	}
	B(int i)
	{
		System.out.println("Parent: Int Parameter");
	}
}
class C extends B
{
	C()
	{
		super();
		System.out.println("Middle: No Parameter");
	}
	C(int i)
	{
		super(i);
		System.out.println("Middle: Int Parameter");
	}
}
class A extends C
{
	A()
	{
		this.hello();
		System.out.println("Child: No Parameter");
	}
	A(int i)
	{
		this.hello();
		System.out.println("Child: Int Parameter");
	}
	public void hello()
	{
		System.out.println("hello");
	}
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new A(2);
	}
}