//suspend and resume
class ThreadNameSR extends Thread
{
	Thread th;
	static long start;
	ThreadNameSR(String n)
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
					if(i==10)
					{
						start = System.currentTimeMillis();
						System.out.println(start);
						th.suspend();
					}
					th.sleep(1000);
				}
				catch(Exception e){
					System.out.println("Exception");
				}
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
				catch(Exception e){
					System.out.println("Exception");
				}
			}
		}
	}
	public static void main(String a[])
	{
		ThreadNameSR td = new ThreadNameSR("Shivam");
		new ThreadNameSR("Shubham");
		while(true)
		{
			long end = System.currentTimeMillis();
			System.out.println(end);
			try{
				Thread.sleep(5000);
				if(end-start>=15000)
				{
					td.th.resume();
					break;
				}
			}
			catch(Exception e){
				System.out.println("Exception");
			}
		}
	}
}