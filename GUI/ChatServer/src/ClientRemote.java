import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

public interface ClientRemote extends Remote 
{
    public void refreshList(Vector v) throws RemoteException;
    public void openPrivateChat(String name,ClientRemote cr) throws RemoteException;
   public void setMessage(ClientRemote c,String msg)throws RemoteException; 
}
