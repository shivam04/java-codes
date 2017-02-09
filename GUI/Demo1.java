import javax.swing.*;
import java.awt.*;
class Demo1
{
	Demo1()
	{
		JFrame f = new JFrame("My Window");
		GridBagLayout gb = new GridBagLayout();
		f.setLayout(gb);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new Demo1();
	}
}