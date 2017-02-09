
import java.awt.BorderLayout;
import javax.jws.soap.SOAPBinding.Style;
import javax.swing.*;
import javax.swing.text.*;


public class JTextPaneWithIcon {
    public static void main(String a[]){
        JFrame f =new JFrame("TextPane Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StyleContext c = new StyleContext();
        StyledDocument doc = new DefaultStyledDocument(c);
        javax.swing.text.Style labelStyle = c.getStyle(StyleContext.DEFAULT_STYLE);
        Icon icon = new ImageIcon("photo0.gif");
        JLabel l = new JLabel(icon);
        StyleConstants.setComponent(labelStyle,l);
        try{
            doc.insertString(doc.getLength(),"Ignored", labelStyle);
        }catch(BadLocationException e){
            System.err.println("oops");
        }
        JTextPane textPane = new JTextPane(doc);
        textPane.setEditable(false);
        JScrollPane scroolPane = new JScrollPane(textPane);
        f.add(scroolPane,BorderLayout.CENTER);
        f.setSize(300, 150);
        f.setVisible(true);
    }
}
