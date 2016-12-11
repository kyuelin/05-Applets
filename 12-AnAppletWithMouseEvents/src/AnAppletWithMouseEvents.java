import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithMouseEvents extends Applet implements MouseListener {
    public void init() {

        addMouseListener(this);
        this.setBackground(panelColor);

    }

    public void mouseClicked(MouseEvent e) {

        System.out.println("Mouse was inside rect, location (" +
                e.getX() + ", " + e.getY() + ")");
        if (e.getX() >= 10 && e.getX() <= 60 && e.getY() >= 10 && e.getY() <= 80) {
            toggleRect=true;
        } else {
            togglePanel = true;
        }
        repaint();
    }

    /****
     public void mouseEntered(MouseEvent e) {System.out.println("entered");}
     public void mouseExited(MouseEvent e) {System.out.println("exited");}
     public void mousePressed(MouseEvent e) {System.out.println("pressed");}
     public void mouseReleased(MouseEvent e) {System.out.println("released");}
     ****/
    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void paint(Graphics graphics) {
        if (toggleRect) {
            Color temp = rectDraw;
            rectDraw = rectFill;
            rectFill = temp;
            toggleRect=false;
        }
        graphics.setColor(rectDraw);
        graphics.drawRect(10, 10, 50, 70);
        graphics.setColor(rectFill);
        graphics.fillRect(11, 11, 48, 68);
        if (togglePanel) {
            Color temp = panelColor;
            panelColor = panelPrev;
            panelPrev = temp;
            togglePanel = false;
        }
        setBackground(panelColor);
    }

    boolean togglePanel, toggleRect;

    Color rectDraw=Color.green, rectFill=Color.red;
    Color panelColor=Color.black, panelPrev=Color.white;
}
