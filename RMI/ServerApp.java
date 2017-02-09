import java.rmi.*;
import java.rmi.server.*;
public class ServerApp extends UnicastRemoteObject implements MiddleApp
{
    public ServerApp() throws RemoteException
    {
        super();
    }
    public String sayHello(String name) throws RemoteException
	{
		return "Hello "+name;
	}
	public static void main(String a[])
	{
		try{
			ServerApp ser = new ServerApp();
			Naming.rebind("rmi://localhost/vaibhav",ser);
			System.out.println("Server registered!!!!");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}