import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WinApp3 extends JFrame
{
	JLabel l,l1;
	JTextField t;
	JButton b;
	WinApp3()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l = new JLabel("Name");
		t = new JTextField();
		l.setBounds(300,100,100,20);
		t.setBounds(450,100,100,20);
		b = new JButton("Submit");
		b.setBounds(400,130,100,20);
		l1 = new JLabel();
		l1.setBounds(400,170,100,20);
		add(l);
		add(t);
		add(b);
		b.addMouseListener(new MyListner());
		add(l1);
		//l.setToolTip("YO");
		setSize(600,300);
		setVisible(true);
	}
	public static void main(String a[])
	{
		new WinApp3();
	}
	class MyListner implements MouseListener
	{
		public void mouseClicked(MouseEvent e)
		{
			String a = t.getText();
			l1.setText(a);
		}
		public void mouseEntered(MouseEvent e)
		{
			
		}
		public void mouseExited(MouseEvent e)
		{
			
		}
		public void mousePressed(MouseEvent e)
		{
			
		}
		public void mouseReleased(MouseEvent e)
		{
			
		}
	}
}