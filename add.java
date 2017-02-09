class calci
{
	public static void main(String[] str)
	{
		System.out.println("Enter Operator:");
		String ch=System.console().readLine();
		String x=System.console().readLine();
		String y=System.console().readLine();
		int a,b;
		a=Integer.parseInt(x);
		b=Integer.parseInt(y);
		int z;
		switch(ch)
		{
			case '+': z=a+b;
					  System.out.println(z);
					  break;
			case '-': z=a-b;
			          System.out.println(z);
					  break;
			case '*': z=a*b;
			          System.out.println(z);
					  break;
			case '/': z=a/b;
			          System.out.println(z);
					  break;
			default: System.out.println("Wrong Operator");
					 break;

		}
	}
}