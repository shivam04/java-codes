//final method can't be overriden
class finalmethod
{
	public final void hello()
	{
		System.out.println("Hello Parent");
	}
}
class finalmethodin extends finalmethod
{
	public final void hello()
	{
		System.out.println("Hello Child");
	}
}