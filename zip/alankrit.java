import java.util.*;
import java.text.*;
import java.awt.*;
public class alankrit
{
	public String  date_ret()
	{  
		DateFormat s=new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		Date date=new Date();
	  	String s1=(s.format(date)).substring(0,10);  
		return s.format(date);
		// Calendar d=Calendar.getInstance();
          	//System.out.println(d.getTime());
	}
    	public static void main(String a[])
	{
          	String s=new alankrit().date_ret();
		System.out.println(s);
             	for(int i=0; i<5; i++)
		{
			Toolkit.getDefaultToolkit().beep();
		}
	}





}
				
