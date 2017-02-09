class clonecons implements Cloneable
{
	int num;
	clonecons()
	{
		num=10;
	}
	public static void main(String ar[])throws Exception
	{
		clonecons a = new clonecons();
		System.out.println(a.num);
		clonecons b =(clonecons)a.clone();
		System.out.println(b.num);
		a.num=12;
		System.out.println(a.num);
		System.out.println(b.num);
	}
}