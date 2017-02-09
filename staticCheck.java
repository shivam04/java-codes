class staticCheck
{
	int a=10;
	public static void h()
	{
		a=20;
	}
	public static void main(String a[])
	{
		staticCheck sc = new staticCheck();
		sc.a=12;
		System.out.println(sc.a);
		staticCheck.h();
		System.out.println(sc.a);
	}
}