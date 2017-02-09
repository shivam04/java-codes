//A b =a; b and a occupy same memory allocation
class copycons
{
	int num;
	copycons()
	{
		num=10;
	}
	public static void main(String ar[])
	{
		copycons a = new copycons();
		System.out.println(a.num);
		copycons b =a;
		System.out.println(b.num);
		a.num=12;
		System.out.println(a.num);
		System.out.println(b.num);
	}
}