class ThreadName extends Thread
{
	Thread th;
	ThreadName(String n)
	{
		th = new Thread(this);
		th.setName(n);
		th.start();
	}
	public void run()
	{
		String s = th.getName();
		if(s.equals("Shivam"))
		{
			for(int i=1;i<=20;i++)
			{
				System.out.println("Shivam "+i);
				try
				{
					th.sleep(1000);
				}
				catch(Exception e){}
			}
		}
		else if(s.equals("Shubham"))
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Shubham "+i);
				try{
					th.sleep(500);
				}
				catch(Exception e){}
			}
		}
	}
	public static void main(String a[])
	{
		new ThreadName("Shivam");
		new ThreadName("Shubham");
	}
}