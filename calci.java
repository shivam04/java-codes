class calci
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Operator:");
		String ch= System.console().readLine();
		String x=System.console().readLine();
		String y=System.console().readLine();
		int a,b;
		char c=ch.charAt(0);
		a=Integer.parseInt(x);
		b=Integer.parseInt(y);
		int z;
		switch(c)
		{
			case '+': z=a+b;
					  System.out.println(z);
					  break;
			case '-': z=a-b;
			          System.out.println(z);
					  break;
			          
			case '*': z=a*b;
					  break;
			case '/': z=a/b;
			          System.out.println(z);
					  break;
			default: System.out.println("Wrong Operator");
					 break;

		}
	}
}