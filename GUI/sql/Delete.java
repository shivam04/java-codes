import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Delete extends Question implements ActionListener 
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
		}
		catch(Exception ev){}
	}
}