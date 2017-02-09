
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;


public class AnimationExample extends Applet{
    Image picture;
    public void init(){
        picture = getImage(getCodeBase(),"logo.jpg");
    }
    public void paint(Graphics g){
        for(int i=0;i<300;i++){
            g.drawImage(picture, i, 30, this);
            try{
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }
}
