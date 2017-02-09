//final variable can't be assigned they are constant
class finalcheck
{
	final int num =10;
	public static void main(String a[])
	{
		finalcheck f = new finalcheck();
		f.num=20;			//error
	}
}