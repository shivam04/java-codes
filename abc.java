public class abc
{
	int x;
	static int y;
	int sum(int a,int b)
	{
		int c = a+b;
		return c;
	}
	public static void main(String[] args)
	{
		abc q= new abc();
		q.x=10;
		y=20;
		int q1 = q.sum(q.x,y);
		System.out.println(q1);
		//System.out.println(c); local variable 'c'
	}
}