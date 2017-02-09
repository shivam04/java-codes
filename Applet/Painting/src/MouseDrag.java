
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class MouseDrag extends Applet implements MouseMotionListener{
    public void init(){
        addMouseMotionListener(this);
        setBackground(Color.red);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(e.getX(),e.getY(),5,5);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
