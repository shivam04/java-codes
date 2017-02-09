import static java.lang.System.*;
class checking
{
	protected int x=7;
	public static void main(String a[])
	{
		out.println("Hello");
	}
}
class c
{
	public static void main(String a[])
	{
		checking ch = new checking();
		out.println(ch.x);
	}
}