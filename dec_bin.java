class binary
{
	public static void main(String a[])
	{
		int n,k;
		long binary,f;
		String x=System.console().readLine();
		n = Integer.parseInt(x);
		binary=0;
		f=1;
		while(n>0)
		{
			k=n%2;
			binary += k*f;
			f*=10;
			n/=2;
		}
		System.out.printf("%lld",binary);
	}
}