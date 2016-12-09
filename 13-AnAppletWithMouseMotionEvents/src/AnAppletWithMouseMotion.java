import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithMouseMotion extends Applet implements MouseMotionListener {
    public void init() {
        addMouseMotionListener(this);
	}

    public void mouseDragged(MouseEvent e) {
        System.out.println("mouse is being dragged at location (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mouseMoved(MouseEvent e) {
        System.out.println("mouse is being moved at location (" + e.getX() + ", " + e.getY() + ")");
    }
}
