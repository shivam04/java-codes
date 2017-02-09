import java.lang.*;
import java.util.*;
class SystemInf
{
	public static void main(String a[])
	{
		//System.out.println("Available processors : "+Runtime.getRuntime().availableProcessors());
		Properties p = System.getProperties();
		p.list(System.out);
	}
}