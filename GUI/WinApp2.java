import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WinApp2 
{
	JTextField t1;
	WinApp2()
	{
		JFrame f = new JFrame();
		GridBagLayout gb = new GridBagLayout();
		f.setLayout(gb);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(5,5,5,5);
		JLabel l1 = new JLabel("User Id");
		gbc.gridx=1;
		gbc.gridy=1;
		gb.setConstraints(l1,gbc);
		f.add(l1);
		t1 = new JTextField(30);
		gbc.gridx=2;
		gbc.gridy=1;
		gb.setConstraints(t1,gbc);
		f.add(t1);
		JLabel l2 = new JLabel("Password");
		gbc.gridx=1;
		gbc.gridy=2;
		gb.setConstraints(l2,gbc);
		f.add(l2);
		JPasswordField t2 = new JPasswordField(30);
		gbc.gridx=2;
		gbc.gridy=2;
		gb.setConstraints(t2,gbc);
		f.add(t2);
		JButton b1 = new JButton("Submit");
		gbc.gridx=1;
		gbc.gridy=3;
		gb.setConstraints(b1,gbc);
		f.add(b1);
		JButton b2 = new JButton("Cancel");
		gbc.gridx=2;
		gbc.gridy=3;
		gb.setConstraints(b2,gbc);
		b1.addMouseListener(new MyListener1());
		f.add(b2);
		f.setSize(600,200);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
			new WinApp2();
	}
	class MyListener1 implements MouseListener
	{
		public void mouseClicked(MouseEvent e)
		{
			String a = t1.getText();
			System.out.println(a);
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