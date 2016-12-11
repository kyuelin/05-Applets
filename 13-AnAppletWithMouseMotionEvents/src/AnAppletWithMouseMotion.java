import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithMouseMotion extends Applet implements MouseMotionListener, MouseListener {
    public void init() {
        addMouseMotionListener(this);
        addMouseListener(this);
	}

    public void mouseDragged(MouseEvent e) {
        System.out.println("mouse is being dragged at location (" + e.getX() + ", " + e.getY() + ")");
        if (dragged) {
            rectX=rectX+e.getX()-mousePrevX;
            rectY=rectY+e.getY()-mousePrevY;
            mousePrevX=rectX;
            mousePrevY=rectY;
            repaint();
        }
    }
    public void mouseMoved(MouseEvent e) {
        System.out.println("mouse is being moved at location (" + e.getX() + ", " + e.getY() + ")");

    }
    public void paint(Graphics graphics) {
        graphics.drawRect(rectX,rectY,rectWidth, rectHeight);
        graphics.setColor(Color.green);
        graphics.fillRect(rectX,rectY,rectWidth, rectHeight);
    }

    boolean dragged;
    int mousePrevX, mousePrevY;
    int rectX =10, rectY=10, rectWidth=40, rectHeight=60;

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getX() >= rectX && e.getX() <= rectX+rectWidth && e.getY() >= rectY  && e.getY() <= rectY+rectHeight) {
            mousePrevX = e.getX();
            mousePrevY = e.getY();
            dragged=true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        dragged=false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
