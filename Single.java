class Single
{
	static Single s;
	int num=10;
	//private Single{}
	Single() {}
	public static Single getSingle()
	{
		if(s==null)
			s=new Single();
		return s;
	}
}
class Impl
{
	public static void main(String args[])
	{
		Single s1 = Single.getSingle();
		s1.num=12;
		Single s2 = Single.getSingle();
		System.out.println(s2.num);
	}
}