
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.*;


public class Client extends JFrame{
    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private String message="";
    private String serverIP;
    private Socket connection;
    public Client(String host){
        super("Client mofo !");
        serverIP = host;
        userText = new JTextField();
        userText.setEditable(false);
        userText.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        sendMessage(e.getActionCommand());
                        userText.setText("");
                    }
                }
        );
        add(userText,BorderLayout.NORTH);
        chatWindow = new JTextArea();
        chatWindow.setEditable(false);
        add(new JScrollPane(chatWindow));
        setSize(300,150);
        setVisible(true);
    }
    //connect to server
    public void startRunning(){
        try{
            connectToServer();
            setupStreams();
            whileChatting();
        }catch(EOFException e){
            showMessage("\n Client Terminated Connection...... \n");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            closeCrap();
        }
    }
    //connect to server
    private void connectToServer() throws IOException{
        showMessage("Attempting Connection.....\n");
        connection = new Socket(serverIP,9658);
        showMessage("Connected to "+connection.getInetAddress().getHostName());
    }
    //setup streams to send and receive messages
    private void setupStreams()throws IOException{
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        showMessage("\n Dude your streams are now good to go! \n");
    }
    //while chatting with server
    private void whileChatting()throws IOException{
        ableToType(true);
        do{
            try{
                message = (String)input.readObject();
                showMessage("\n "+message);
            }catch(ClassNotFoundException e){
                showMessage("\n I Don't Know that Object Type! \n");
            }
        }while(!message.equals("SERVER - END"));
    }
    //closes the streams and sockets
    public void closeCrap(){
        showMessage("\n closing crap down... \n");
        ableToType(false);
        try{
            output.close();
            input.close();
            connection.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private void sendMessage(String message){
        try{
            output.writeObject("CLIENT - "+message);
            output.flush();
            showMessage("\n CLIENT - "+message);
        }catch(IOException e){
            chatWindow.append("\n something messed up sending message hoss! \n");
        }
    }
    //change/update chat window
    private void showMessage(final String m){
        SwingUtilities.invokeLater(
                new Runnable() {

            @Override
            public void run() {
                chatWindow.append(m);
            }
        }
        );
    }
    // gives permission to type crap into the text box
    private void ableToType(final boolean tof){
        SwingUtilities.invokeLater(
                new Runnable() {

            @Override
            public void run() {
                userText.setEditable(tof);
            }
        }
        );
    }
}
