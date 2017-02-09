public class TEST
{
	public static void main(String[] args) 
	{
		int n;
		while(true)
		{
			n=Integer.parseInt(System.console().readLine());
			if(n==42)
			break;
			System.out.println(n);
		}
	}
}