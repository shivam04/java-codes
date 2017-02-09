import java.rmi.Remote;
import java.rmi.RemoteException;
public interface ServerRemote extends Remote
{
    public void registerUser(String name, ClientRemote cr) throws RemoteException;
    public void selectUser(String select,ClientRemote cr) throws RemoteException;

    public void sendMessage(String msg, ClientRemote cr,String name)throws RemoteException;
}