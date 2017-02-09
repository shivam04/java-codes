import stat.reuse.Stat;
import static stat.reuse.Stat.*;
class Callstatimport
{
	public static void main(String a[])
	{
		Stat s = new Stat();
		s.fn1();
		Stat.fn2();
		fn2();
	}
}