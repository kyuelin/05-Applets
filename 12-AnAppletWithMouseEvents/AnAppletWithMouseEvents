import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithMouseEvents extends Applet implements MouseListener {
    public void init() {
        addMouseListener(this);
	}

    public void mouseClicked(MouseEvent e) {
        String clickDesc;
        if (e.getClickCount() == 2)
            clickDesc = "double";
        else
            clickDesc = "single";

        System.out.println("Mouse was " + clickDesc + "-clicked at location (" +
            e.getX() + ", " + e.getY() + ")");
    }
    /****
		public void mouseEntered(MouseEvent e) {System.out.println("entered");}
    		public void mouseExited(MouseEvent e) {System.out.println("exited");}
    		public void mousePressed(MouseEvent e) {System.out.println("pressed");}
    		public void mouseReleased(MouseEvent e) {System.out.println("released");}
	****/
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
