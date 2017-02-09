import java.awt.*;
class size
{
	public static void main(String a[])
	{
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int  sw = (int)(d.getWidth());
        int  sh = (int)(d.getHeight());
		System.out.println(sw+" X "+sh);
	}
}