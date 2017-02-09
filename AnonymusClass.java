class AnonymusClass
{
	public void print()
	{
		
	}
	public static void main(String a[])
	{
		implementAnonymusClass iac = new implementAnonymusClass();
		iac.ac.print();
	}
}
class implementAnonymusClass
{
	AnonymusClass ac = new AnonymusClass()
	{
		public void print()
		{
			System.out.println("Basics of java programming");
		}
	}; //; indicates end of statement
}