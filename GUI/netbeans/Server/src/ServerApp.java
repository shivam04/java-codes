
import com.mysql.jdbc.ResultSet;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class ServerApp extends UnicastRemoteObject implements MiddleApp
{
    public ServerApp() throws RemoteException
    {
        super();
    }
    @Override
    public String[] fetchQuestion(int qno) throws RemoteException {
        String[] s = new String[5];
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123");
           Statement st = con.createStatement();
           ResultSet rs =(ResultSet) st.executeQuery("Select * from questions where qno="+qno);
           rs.next();
           s[0] = rs.getString(1);
           s[1] = rs.getString(2);
           s[2] = rs.getString(3);
           s[3] = rs.getString(4);
           s[4] = rs.getString(5);
       }
       catch(Exception e){
           System.out.println(e);
       }
       return s;
    }
    public static void main(String a[])
    {
        try{
			ServerApp ser = new ServerApp();
			Naming.rebind("vaibhav",ser);
			System.out.println("Server registered!!!!");
		}
		catch(Exception e){
			System.out.println(e);
		}
    }
    
}
