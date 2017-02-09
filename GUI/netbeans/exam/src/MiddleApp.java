import java.rmi.*;
public interface MiddleApp extends Remote
{
    String[] fetchQuestion(int qno) throws RemoteException;
}
