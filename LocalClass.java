class LocalClass
{
	private int t = 10; // can be accessible from local class
	public static void main(String a[])
	{
		LocalClass out = new LocalClass();
		out.method();
		//out.method().implementLocalClass imp = out.method().new implementLocalClass();
		//imp.disp();
		System.out.println(out.method());
	}
	int method()
	{
		int k = 10; //can't be accessible from local class
		final int w = 100; // can be accessible from local class
		class implementLocalClass
		{
			void disp()
			{
				System.out.println("w="+w);
			}
		}
		return t;
	}
}