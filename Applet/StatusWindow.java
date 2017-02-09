import java.applet.*;
import java.awt.*;
/*TO Run From Cmd Applet Tag Is Required  appletviewer file.java*/
//<applet code="StatusWindow" width=300 height=50></applet>
public class StatusWindow extends Applet
{
	public void init()
	{
		setBackground(Color.yellow);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is in the applet window",10,20);
		showStatus("This is shown in the status window");
	}
}