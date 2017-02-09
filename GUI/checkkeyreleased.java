import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class checkkeyreleased extends KeyAdapter
{
	JLabel l;
	checkkeyreleased()
	{
		JFrame f=new JFrame();
		f.setUndecorated(true);
		JPanel p=new JPanel();
		p.setLayout(null);
		p.setBackground(Color.white);
		l=new JLabel();
		ImageIcon icon=new ImageIcon("1.png");
		l.setIcon(icon);
		l.setBounds(100,100,30,30);
		p.add(l);
		f.add(p);
		f.addKeyListener(this);
		f.setSize(600,600);
		f.setVisible(true);
	}
	public void keyReleased(KeyEvent e)
	{
		int t = e.getKeyCode();
		System.out.println(t);
	}
	public static void main(String a[])
	{
		new checkkeyreleased();
	}
}