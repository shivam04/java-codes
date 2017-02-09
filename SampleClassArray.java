import java.lang.reflect.*;
public class SampleClassArray
{
	public static void main(String a[])
	{
		int[] intArray = {12,78};
		dispalyArray(intArray);
	}
	public static void dispalyArray(Object ob)
	{
		System.out.println(Array.get(ob,0));
		Array.set(ob,0,15);
		System.out.println(Array.get(ob,0));
	}
}