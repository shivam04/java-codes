class checkOverride
{
	public void q(int a)
	{
		System.out.println(a);
	}
}
class checkOverride1 extends checkOverride
{
	@Override 
	public void q(long a)
	{
		System.out.println(a);
	}
	public static void main(String a[])
	{
		checkOverride1 co = new checkOverride1();
		co.q(2);
	}
}
