import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Form extends MouseAdapter
{
	JFrame f;
	JTextField t1,t3;
	JPasswordField t2;
	Form()
	{
		f = new JFrame("SqlCheck");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		JLabel l1 = new JLabel("Name: ");
		l1.setBounds(50,50,75,25);
		t1 = new JTextField(50);
		t1.setBounds(150,50,150,25);
		JLabel l2 = new JLabel("Password: ");
		l2.setBounds(50,100,75,25);
		t2 = new JPasswordField(50);
		t2.setBounds(150,100,150,25);
		JLabel l3 = new JLabel("College: ");
		l3.setBounds(50,150,75,25);
		t3 = new JTextField(50);
		t3.setBounds(150,150,150,25);
		JButton b = new JButton("Submit");
		b.setBounds(125,200,75,25);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b);
		b.addMouseListener(this);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		try{
			String name = t1.getText();
			String password = t2.getText();
			String college = t3.getText();
			//System.out.println("true");
			//System.out.println(name+" "+password+" "+college);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123");
			Statement st = con.createStatement();
			DatabaseMetaData dbm = con.getMetaData();
			ResultSet res = dbm.getTables(null,null,"details",null);
			if(res.next())
			{
				st.executeUpdate("insert into details values('"+name+"','"+password+"','"+college+"')");
			}
			else
			{
				System.out.println("Table Created");
				st.execute("create table details (name varchar(100),password varchar(100),college varchar(100))");
				st.executeUpdate("insert into details values('"+name+"','"+password+"','"+college+"')");
			}
			//st.execute("create table details (name varchar(100),password varchar(100),college varchar(100))");
			//st.executeUpdate("insert into details values('"+name+"','"+password+"','"+college+"')");
			st.close();
			con.close();
		}
		catch(Exception ev){}
		f.dispose();
	}
	public static void main(String a[])
	{
		new Form();
	}
}
