class format_specifiers
{
	public static void main(String a[])
	{
		int value = 100;
		boolean bool = false;
		if((bool==true)&&((value+=100)==200))
		{
			System.out.println("Equal "+value);
		}
		else
		{
			System.out.println(value+" Not Equal");
		}
		//System.out.printf("%158.0f",q);
	}
}