class ThreadDemo
{
	Thread th1,th2;
	ThreadDemo()
	{
		th1 = new Thread(new MyThread1());
		th2 = new Thread(new MyThread2());
		th1.start();
		th2.start();
	}
	class MyThread1 extends Thread
	{
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Child Thread1 "+i);
				try{
					th1.sleep(100);	
				}
				catch(Exception e)
				{}
			}
		}
	}
	class MyThread2 extends Thread
	{
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Child Thread2 "+i);
				try{
					th2.sleep(500);	
				}
				catch(Exception e)
				{}
			}
		}
	}
	public static void main(String a[])
	{
		System.out.println("Main Entered!!!!");
		ThreadDemo td = new ThreadDemo();
		try{
			td.th2.join();
		}
		catch(Exception e){}
		System.out.println("Main Exiting.....");
	}
}