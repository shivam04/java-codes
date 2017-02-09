import java.util.*;
class ThreadCheck extends Thread
{
	Date d;
	Thread th;
	String s;
	ThreadCheck(Date d,String s)
	{
		this.d=d;
		this.s=s;
		th = new Thread(this);
		th.start();
	}
	public void run()
	{
		Synchronized(d)
		{
			int date = d.getSeconds();
		}
		System.out.print("["+s+" "+date);
		try
		{
			th.sleep(1000);
		}
		catch(Exception e){}
		System.out.print("]");
	}
	public static void main(String a[])
	{
		Date d = new Date();
		new ThreadCheck(d,"1");
		new ThreadCheck(d,"2");
		new ThreadCheck(d,"3");
	}
}