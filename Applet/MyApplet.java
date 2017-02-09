import java.applet.*;
import java.awt.*;
/*TO Run From Cmd Applet Tag Is Required*/
//<applet code="MyApplet.class" width=400 height=400></applet>
public class MyApplet extends Applet
{
	int start=0,stop=0,destroy=0,init=0;
	public void init()
	{
		init++;
	}
	public void start()
	{
		start++;
	}
	public void stop()
	{
		stop++;
	}
	public void destroy()
	{
		destroy++;
	}
	public void paint(Graphics g)
	{
		g.drawString("Init Method "+init,20,20);
		g.drawString("Start Method "+start,20,40);
		g.drawString("Stop Method "+stop,20,60);
		g.drawString("Destroy Method "+destroy,20,80);
	}
}