import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Question extends MouseAdapter
{
	JFrame f;
	JTextArea ta1;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JPanel p1,p2,p3;
	JTabbedPane tp;
	JButton b;
	JComboBox cb,cb1;
	public Question()
	{
		initcomponent();
		cb = new JComboBox();
		cb.addItem("Select Question");
		cb.setBounds(10,10,150,25);
		cb.addActionListener(new update());
		p2.add(cb);
		cb1 = new JComboBox();
		cb1.addItem("Select Question");
		cb1.setBounds(10,10,150,25);
		p3.add(cb1);
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from questions");
			while(rs.next())
			{
				int q = rs.getInt("qno");
				cb.addItem("Question "+q);
				cb1.addItem("Question "+q);
			}
			st.close();
			con.close();
		}
		catch(Exception ev){
			System.out.println(ev);
		}
	}
	public void initcomponent()
	{
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tp = new JTabbedPane();
		tp.setSize(700,450);
		tp.setTabPlacement(tp.LEFT);
		p1 = new JPanel();
		p1.setLayout(null);
		tp.addTab("Insert",new ImageIcon("download.png"),p1);
		ta1 = new JTextArea();
		ta1.setBounds(10,10,500,150);
		ta1.setBorder(BorderFactory.createTitledBorder("Question"));
		ta1.setColumns(50);
		ta1.setRows(5);
		p1.add(ta1);
		tf1 = new JTextField(20);
		tf1.setBounds(10,200,240,50);
		tf1.setBorder(BorderFactory.createTitledBorder("Option1"));
		p1.add(tf1);
		tf2 = new JTextField(20);
		tf2.setBounds(260,200,240,50);
		tf2.setBorder(BorderFactory.createTitledBorder("Option2"));
		p1.add(tf2);
		tf3 = new JTextField(20);
		tf3.setBounds(10,260,240,50);
		tf3.setBorder(BorderFactory.createTitledBorder("Option3"));
		p1.add(tf3);
		tf4 = new JTextField(20);
		tf4.setBounds(260,260,240,50);
		tf4.setBorder(BorderFactory.createTitledBorder("Option4"));
		p1.add(tf4);
		tf5 = new JTextField(10);
		tf5.setBounds(135,325,200,25);
		tf5.setText("Enter Answer:");
		tf5.setForeground(new Color(204,204,204));
		p1.add(tf5);
		tf5.addFocusListener(new enter_anwer());
		b = new JButton("Submit");
		b.setBounds(135,375,200,25);
		b.addMouseListener(this);
		p1.add(b);
		p2 = new JPanel();
		p2.setLayout(null);
		tp.addTab("Updtae",new ImageIcon("refresh_pressed.png"),p2);
		p3 = new JPanel();
		p3.setLayout(null);
		tp.addTab("Delete",new ImageIcon("ic_menu_delete.png"),p3);
		JButton delb = new JButton("Delete");
		delb.setBounds(10,200,100,25);
		delb.addActionListener(new Delete());
		p3.add(delb);
		f.add(tp);
		f.setSize(700,450);
		f.setVisible(true);
	}
	class enter_anwer implements FocusListener
	{
		public void focusGained(FocusEvent e)
		{
			String s = tf5.getText();
			if(s.equals("Enter Answer:"))
			{
				tf5.setText("");
				tf5.setForeground(Color.black);
			}
		}
		public void focusLost(FocusEvent e)
		{
			String s = tf5.getText();
			if(s.equals(""))
			{
				tf5.setText("Enter Answer:");
				tf5.setForeground(new Color(204,204,204));
			}
		}
	}
	class update extends MouseAdapter implements ActionListener
	{
		int sel,total;
		JTextArea ta1;
		JTextField tf1,tf2,tf3,tf4,tf5;
		public update()
		{
			ta1 = new JTextArea();
			ta1.setBounds(10,40,500,150);
			ta1.setBorder(BorderFactory.createTitledBorder("Question"));
			ta1.setColumns(50);
			ta1.setRows(5);
			p2.add(ta1);
			tf1 = new JTextField(20);
			tf1.setBounds(10,200,240,50);
			tf1.setBorder(BorderFactory.createTitledBorder("Option1"));
			p2.add(tf1);
			tf2 = new JTextField(20);
			tf2.setBounds(260,200,240,50);
			tf2.setBorder(BorderFactory.createTitledBorder("Option2"));
			p2.add(tf2);
			tf3 = new JTextField(20);
			tf3.setBounds(10,260,240,50);
			tf3.setBorder(BorderFactory.createTitledBorder("Option3"));
			p2.add(tf3);
			tf4 = new JTextField(20);
			tf4.setBounds(260,260,240,50);
			tf4.setBorder(BorderFactory.createTitledBorder("Option4"));
			p2.add(tf4);
			tf5 = new JTextField(10);
			tf5.setBounds(135,325,200,25);
			tf5.setText("Enter Answer:");
			tf5.setForeground(new Color(204,204,204));
			p2.add(tf5);
			JButton b = new JButton("Submit");
			b.setBounds(135,375,200,25);
			b.addMouseListener(this);
			p2.add(b);
		}
		public void actionPerformed(ActionEvent e)
		{
			String s = cb.getSelectedItem().toString();
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123");
				Statement st = con.createStatement();
				ResultSet count = st.executeQuery("select count(*) from questions");
				if(count.next())
					total = count.getInt("Count(*)");
				for(int i=1;i<=total;i++)
				{
					if(s.equals("Question "+i))
					{
						sel = i;
						break;
					}
				}
				ResultSet r = st.executeQuery("select * from questions where qno="+sel);
				if(r.next())
				{
					ta1.setText(r.getString(1));
					tf1.setText(r.getString(2));
					tf2.setText(r.getString(3));
					tf3.setText(r.getString(4));
					tf4.setText(r.getString(5));
					tf5.setText(r.getString(6));
					tf5.setForeground(Color.black);
				}
			}
			catch(Exception ev){}
		}
		public void mouseClicked(MouseEvent e)
		{
			try{
				String question = ta1.getText();
				String option1 = tf1.getText();
				String option2 = tf2.getText();
				String option3 = tf3.getText();
				String option4 = tf4.getText();
				String answer = tf5.getText();
				//System.out.println(question+" "+option1+" "+option2+" "+option3+" "+option4+" "+answer+" "+sel);
				Class.forName("com.mysql.jdbc.Driver");
				//System.out.println("yo1");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123");
				//System.out.println("yo2");
				Statement st = con.createStatement();
				//System.out.println("yo3");
				String qno = sel+"";
				PreparedStatement state = con.prepareStatement("update questions set question=?, option1=?, option2=?, option3=?, option4=?, answer=? where qno=?");
				state.setString(1,question);
				state.setString(2,option1);
				state.setString(3,option2);
				state.setString(4,option3);
				state.setString(5,option4);
				state.setString(6,answer);
				state.setString(7,qno);
				state.executeUpdate();
				//System.out.println("yo");
				st.close();
				con.close();
				ta1.setText("");
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("Enter Answer:");
				tf5.setForeground(new Color(204,204,204));
			}
			catch(Exception evv){
				System.out.println("Exception");
				//evv.printStackTrace();
			}
		}
	}
	class Delete implements ActionListener 
	{
		int sel,total;
		public void actionPerformed(ActionEvent e)
		{
			String s = cb1.getSelectedItem().toString();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123");
				Statement st = con.createStatement();
				ResultSet count = st.executeQuery("select count(*) from questions");
				if(count.next())
					total = count.getInt("Count(*)");
				for(int i=1;i<=total;i++)
				{
					if(s.equals("Question "+i))
					{
						sel = i;
						break;
					}
				}
				st.executeUpdate("delete from questions where qno="+sel);
				st.close();
				con.close();
				System.out.println("Question Deleted");
			}
			catch(Exception ev){}
		}
	}
	public void mouseClicked(MouseEvent e)
	{
		try
		{
			String question = ta1.getText();
			String option1 = tf1.getText();
			String option2 = tf2.getText();
			String option3 = tf3.getText();
			String option4 = tf4.getText();
			String answer = tf5.getText();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123");
			Statement st = con.createStatement();
			DatabaseMetaData dbm = con.getMetaData();
			ResultSet res = dbm.getTables(null,null,"questions",null);
			if(res.next())
			{
				st.executeUpdate("insert into questions (question,option1,option2,option3,option4,answer) values('"+question+"','"+option1+"','"+option2+"','"+option3+"','"+option4+"','"+answer+"')");
				try{
					//Class.forName("com.mysql.jdbc.Driver");
					//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123");
					//Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from questions");
					while(rs.next())
					{
						int q = rs.getInt("qno");
						cb.addItem("Question "+q);
						cb1.addItem("Question "+q);
					}
					st.close();
					con.close();
				}
				catch(Exception ev){
					System.out.println(ev);
				}
			}
			else
			{
				System.out.println("Table Created");
				st.execute("create table questions (question varchar(100),option1 varchar(100),option2 varchar(100),option3 varchar(100),option4 varchar(100),answer varchar(100))");
				st.executeUpdate("insert into questions (question,option1,option2,option3,option4,answer) values('"+question+"','"+option1+"','"+option2+"','"+option3+"','"+option4+"','"+answer+"')");
				try{
					//Class.forName("com.mysql.jdbc.Driver");
					//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123");
					//Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from questions");
					while(rs.next())
					{
						int q = rs.getInt("qno");
						cb.addItem("Question "+q);
						cb1.addItem("Question "+q);
					}
					st.close();
					con.close();
				}
				catch(Exception ev){
					System.out.println(ev);
				}
			}
			st.close();
			con.close();
			ta1.setText("");
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("Enter Answer:");
			tf5.setForeground(new Color(204,204,204));
		}
		catch(Exception ev){
			System.out.println("Exception");
		}
	}
	public static void main(String args[])
	{
		new Question();
	}
}