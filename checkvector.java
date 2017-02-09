import java.util.*;
class checkvector
{
	public static void main(String[] a)
	{
		Vector<Integer[]> s = new Vector<Integer[]>();
		s.addElement(new Integer[]{3,4});
		Vector.sort(s);
		System.out.println(s.elementAt(0)[0]);
	}
}