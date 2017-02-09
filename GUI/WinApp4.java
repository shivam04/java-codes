import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class WinApp4
{
	JPanel p;
	WinApp4()
	{
		JFrame f = new JFrame("My Frame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		f.add(p);
		p.addMouseListener(new MyListener2());
		f.setSize(600,300);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new WinApp4();
	}
	class MyListener2 implements MouseListener
	{
		public void mouseClicked(MouseEvent e)
		{
			p.setBackground(Color.red);
		}
		public void mouseEntered(MouseEvent e)
		{
			p.setBackground(Color.green);
		}
		public void mouseExited(MouseEvent e)
		{
			p.setBackground(Color.blue);
		}
		public void mousePressed(MouseEvent e)
		{
			p.setBackground(Color.magenta);
		}
		public void mouseReleased(MouseEvent e)
		{
			p.setBackground(Color.cyan);
		}
	}
}