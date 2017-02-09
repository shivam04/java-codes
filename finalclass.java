//final class can't be inherited
import java.util.*;
final class finalclass
{
	public void beginText()
	{
		System.out.println("Beginning Text of the Specifications");
	}
	public void bodyText(String text)
	{
		System.out.println(text);
	}
	public void endText()
	{
		System.out.println("Ending Text of the Specifications");
	}
}
class finalclass1 extends finalclass
{
	public static void main(String a[])
	{
		System.out.println("Hello Main");
		finalclass fc = new finalclass();
		fc.beginText();
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		fc.bodyText(text);
		fc.endText();
	}
}