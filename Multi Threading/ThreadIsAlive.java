class ThreadIsAlive implements Runnable
{ 
	static int i=0;
	public void run()
	{
		System.out.println("Hello");
		i=1;
		System.out.println(i);
	}
	public static void main(String a[]) throws Exception
	{
		Thread th = new Thread(new ThreadIsAlive());
		System.out.println("Thread is Alive-> "+th.isAlive());
		th.start();
		System.out.println("Thread is Alive-> "+th.isAlive());
		try
		{
			th.join(0,1);
		}
		catch(Exception e){}
		if(i==1)
			System.out.println("Thread is Alive-> "+th.isAlive());
		System.out.println(i);
		//th.start();
	}
}