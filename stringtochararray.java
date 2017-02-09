class stringtochararray
{
	public static void main(String a[])
	{
		String s = "Hello Shivam";
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}