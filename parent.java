class parent
{
	parent()
	{
		System.out.println("hello");
	}
	public static void main(String a[])
	{
		new child().y();
		new parent();
	}
}