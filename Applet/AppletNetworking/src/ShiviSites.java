import java.net.*;
import java.awt.*;
import java.util.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;
public class ShiviSites extends JApplet{
    private HashMap<String,URL> websiteInfo;
    private ArrayList<String> titles;
    JList mainList;
    //init
    public void init(){
        websiteInfo = new HashMap<String,URL>();
        titles = new ArrayList<String>();
        grabHTMLInfo();
        add(new JLabel("What Website do you want to vist?"),BorderLayout.NORTH); 
        mainList = new JList(titles.toArray());
        mainList.addListSelectionListener(
                new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object obj = mainList.getSelectedValue();
                URL newDocument = websiteInfo.get(obj);
                AppletContext browser = getAppletContext();
                browser.showDocument(newDocument);
            }
        }
        );
        add(new JScrollPane(mainList),BorderLayout.CENTER);
    }
    //getting website info
    private void grabHTMLInfo(){
        String title;
        String address;
        URL url;
        int counter = 0;
        title = getParameter("title"+counter);
        while(title!=null)
        {
            address = getParameter("address"+counter);
            try{
                url = new URL(address);
                websiteInfo.put(title, url);
                titles.add(title);
            }catch(MalformedURLException e){
                e.printStackTrace();
            }
            ++counter;
            title = getParameter("title"+counter);
        }
    }
}
