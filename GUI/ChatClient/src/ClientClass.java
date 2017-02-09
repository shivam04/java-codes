import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;
import javax.swing.JList;
import javax.swing.JTextArea;
public class ClientClass extends UnicastRemoteObject implements ClientRemote
{
    public ClientClass(JList l) throws RemoteException
    {
        super();
        this.l=l;
    }
    public ClientClass(JTextArea t) throws RemoteException
    {
        super();
        this.t=t;
    }
    JList l;
    JTextArea t;
    @Override
    public void refreshList(Vector v) throws RemoteException {
        l.setListData(v);
    }

    @Override
    public void setMessage(ClientRemote c,String msg) throws RemoteException {
       t.setText(msg);
    }

    @Override
    public void openPrivateChat(String name,ClientRemote cr) throws RemoteException {
        new PrivateChat(name,cr).setVisible(true);
    }
}
