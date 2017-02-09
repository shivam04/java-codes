class Deadlock implements Runnable
{
	Deadlock grab;
	public synchronized void run()
	{
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		grab.syncit();
	}
	public static void main(String a[])
	{
		Deadlock d1 = new Deadlock();
		Deadlock d2 = new Deadlock();
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		d1.grab = d2;
		d2.grab = d1;
		t1.start();
		t2.start();
		System.out.println("Started");
		try{
			t1.join();
			t2.join();
		}
		catch(Exception e){
			System.out.println("Exception");
		}
	}
	public synchronized void syncit()
	{
		try{
			Thread.sleep(500);
			System.out.println("Sync");
		}
		catch(Exception e){
			System.out.println("Exception");
		}
	}
}