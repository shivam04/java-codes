import java.rmi.*;
import java.util.*;
class ClientApp 
{
	public static void main(String a[])
	{
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name:");
			String n = sc.nextLine();
			MiddleApp app = (MiddleApp)Naming.lookup("rmi://localhost/vaibhav");
			String r = app.sayHello(n);
			System.out.println(r);
		}
		catch(Exception e){}
	}
}