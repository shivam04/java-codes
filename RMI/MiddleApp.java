import java.rmi.*;
public interface MiddleApp extends Remote
{
    String sayHello(String name) throws RemoteException;
}
