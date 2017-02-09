public class mugsBar
{
	float price = 44.3F;
	String materialUsed;
	String make;
	{
		make = "ogilvy";
		materialUsed = "Crystal";
		System.out.println("Object Block\n"+price+" "+make+" "+materialUsed);
	}
	mugsBar()
	{
		System.out.println("Constructor\n"+price+" "+make+" "+materialUsed);
	}
	public static void main(String a[])
	{
		mugsBar mb = new mugsBar();
		System.out.println("Main Method");
	}
}