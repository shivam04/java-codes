class static_block
{
	static int a = 10;
static int b = 20;
	public static void main(String a[])
	{
		System.out.println("Main Method");
	}
	static
	{
		System.out.println("Static 2"+a);
	}
	static
	{
		System.out.println("Static 1"+b);
	}
	
}