import java.awt.*;
class ScreenSize
{
	public static void main(String args[])
	{
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(d.getWidth());
		System.out.println(d.getHeight());
		Toolkit.getDefaultToolkit().beep();
	}

}