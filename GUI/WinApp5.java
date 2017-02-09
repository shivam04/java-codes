import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WinApp5 extends KeyAdapter
{
	JLabel l;
	public WinApp5()
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
		Timer t=new Timer(25,new MyListener());
		t.start();
	}
	public class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(kc==KeyEvent.VK_UP)
			{
				x=x>0?x-5:600;
			}
			else if(kc==KeyEvent.VK_DOWN)
			{
				x=(x+5)%600;
			}
			else if(kc==KeyEvent.VK_LEFT)
			{
				y=y>0?y-5:600;
			}
			else if(kc==KeyEvent.VK_RIGHT)
			{
				y=y<600?y+5:0;
			}
			l.setBounds(y,x,30,30);
		}
	}
	int x=100,y=100,kc=37;
	public void keyPressed(KeyEvent e)
	{
		kc=e.getKeyCode();
		System.out.println(kc);
	}
	public static void main(String a[])
	{
		new WinApp5();
	}
}