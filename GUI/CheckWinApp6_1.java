import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
class CheckWinApp6_1 extends KeyAdapter
{
	JLabel label1,label2,l;
	Timer t;
	int c=0,flag=0;
	int cl[][] = {
		{10,10,8,8},
		{10,8,10,7},
		{11,11,7,10},
		{4,10,8,8}
	};
	int cr[][] = {
		{4,4,4,4},
		{3,5,3,5},
		{5,3,3,5},
		{4,10,8,8}
	};
	int checkx[][]={
		{0,400,720,400},
		{0,320,720,440},
		{0,440,720,320},
		{0,400,720,400}
	};
	int checky[][]={
		{160,0,160,320},
		{200,0,120,320},
		{120,0,120,320},
		{160,0,160,320}
	};
	int i=0;
	public CheckWinApp6_1(String name)
	{
		JFrame f = new JFrame("Game 1");
		f.setUndecorated(true);
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBackground(Color.white);
		label1 = new JLabel();
		ImageIcon icon1 = new ImageIcon("1.png");
		label1.setIcon(icon1);
		label1.setBounds(400,320,30,30);
		label2 = new JLabel();
		ImageIcon icon2 = new ImageIcon("2.png");
		label2.setIcon(icon2);
		label2.setBounds(400,350,75,17);
		l=new JLabel();
		l.setBounds(750,160,30,30);
		p.add(l);
		JLabel l1 = new JLabel();
		l1.setBounds(750,100,50,25);
		l1.setText(name);
		p.add(label1);
		p.add(label2);
		p.add(l1);
		f.addKeyListener(this);
		f.add(p);
		f.setSize(800,400);
		f.setVisible(true);
		t = new Timer(25,new MyActionListen());
		t.start();
		Timer k= new Timer(200,new A());
		k.start();
	}
	int a=440, b=320;
	public class MyActionListen implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if((a>0&&a<=440)&&(b>120&&b<=320)&&flag==0)
			{
				a-=11;
				b-=5;
				//System.out.println(a+" "+b);
			}
			else if((a>=0&&a<440)&&(b>0&&b<=120))
			{
				flag=1;
				a+=11;
				b-=3;
				//System.out.println(a+" "+b);
			}
			else if((a>=440&&a<720)&&(b>=0&&b<120))
			{
				a+=7;
				b+=3;
				//System.out.println(a+" "+b);
			}
			else if((a>320&&a<=720)&&(b>=120&&b<320))
			{
				a-=10;
				b+=5;
				System.out.println(a+" "+b);
			}
			/*if((x<330||x>430)&&b==320)
			{
				t.stop();
				System.out.println("Game Over");
			}*/
			if(b==320&&a==checkx[i][3])
			{
				t.stop();
				flag=0;
				i=(i+1)%4;
			}
			label1.setBounds(a,b,30,30);
		}
	}
	class A implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			l.setText(c+"");
		}
	}
	int x=400;
	public void keyPressed(KeyEvent e)
	{
		int kc = e.getKeyCode();
		if(kc==KeyEvent.VK_LEFT)
		{
			if(x>=7)
			{
				x= x-5;
			}
		}
		else if(kc==KeyEvent.VK_RIGHT)
		{
			if(x<=719)
			{
				x=x+5;
			}
		}
		label2.setBounds(x,350,75,17);
	}
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		new CheckWinApp6_1(name);
	}
}