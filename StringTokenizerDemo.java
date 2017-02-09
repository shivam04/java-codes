import java.util.*;
class StringTokenizerDemo
{
	public static void main(String args[])
	{
		String str = "Hello Shivam Sinha HOw are you";
		StringTokenizer st = new StringTokenizer(str);
		//countTokens method()
		System.out.println(st.countTokens());
		//hasMoreElements method()
		if(st.hasMoreElements())
			System.out.println("Has More Element");
		else
			System.out.println("No More Element");
		//hasMoreTokens method()
		if(st.hasMoreTokens())
			System.out.println("Has More Tokens");
		else
			System.out.println("No More Tokens");
		//nextElement method()
		while(st.hasMoreTokens())
			System.out.println(st.nextElement());
		//nextToken method()
		StringTokenizer stv = new StringTokenizer(str);
		while(stv.hasMoreTokens())
			System.out.println(stv.nextToken());
	}
}