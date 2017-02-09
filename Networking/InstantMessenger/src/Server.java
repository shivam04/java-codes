
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;


public class Server extends JFrame{
    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;
    public Server(){
        super("Instant Messenger");
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
    //setup and run the server
    public void startRunning(){
        try{
            server = new ServerSocket(9658);
            while(true){
                try{
                    waitForConnection();
                    setupStreams();
                    whileChatting();
                }catch(EOFException e){
                    showMessage("Server Ended the connection");
                }finally{
                    closeCrap();
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //wait for connection, then display connection information
    public void waitForConnection() throws IOException{
        showMessage("Waiting For Someone to connect......!!\n");
        connection = server.accept();
        showMessage("Now Connected to "+connection.getInetAddress().getHostName());
    }
    //get stream to send and receive data
    public void setupStreams()throws IOException{
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        showMessage("\n Streams are now setup! \n");
    }
    //during chat conversation
    public void whileChatting()throws IOException{
        String message = "You are now Connected!";
        showMessage(message);
        ableToType(true);
        do{
            try{
                message = (String)input.readObject();
                showMessage("\n"+message);
            }catch(ClassNotFoundException e){
                showMessage("What the User Send");
            }
        }while(!message.equals("CLIENT - END"));
    }
    private void closeCrap(){
        showMessage("\n Closing Connections..... \n");
        ableToType(false);
        try{
            output.close();
            input.close();
            connection.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private void sendMessage(String Message){
        try{
            output.writeObject("SERVER - "+Message);
            output.flush();
            showMessage("\nSERVER - "+Message);
        }catch(IOException e){
            chatWindow.append("ERROR: DUDE I CANT SEND THIS MESSAGE");
        }
    }
    private void showMessage(final String text){
        SwingUtilities.invokeLater(
                new Runnable(){
                    @Override
                    public void run() {
                        chatWindow.append(text);
                    }        
                }
        );
    }
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
