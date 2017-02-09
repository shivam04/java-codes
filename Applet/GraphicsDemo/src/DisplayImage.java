
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;


public class DisplayImage extends Applet {
    Image picture;
    public void init(){
        picture=getImage(getCodeBase(), "Bhaiya.jpg");
    }
    public void paint(Graphics g){
        g.drawImage(picture, 30, 30, this);
    }
}
