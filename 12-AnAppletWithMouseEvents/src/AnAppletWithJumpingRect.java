import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

/**
 * Created by linken on 12/11/16.
 */
public class AnAppletWithJumpingRect extends Applet implements MouseListener {

    public void init() {
        addMouseListener(this);
    }

    public void paint(Graphics graphic) {

        graphic.drawRect(rectX, rectY, rectWidth, rectHeight);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("Mouse was inside rect, location (" +
                e.getX() + ", " + e.getY() + ")");
        if (e.getX() >= rectX && e.getX() <= (rectX+rectWidth) && e.getY() >= rectY && e.getY() <= (rectHeight+rectY)) {
            while(e.getX() >= rectX && e.getX() <= (rectX+rectWidth) || rectX <= 0|| rectX >=this.getWidth())
                rectX = new Random().nextInt();
            while(e.getY() >= rectY && e.getY() <= (rectHeight+rectY) || rectY<=0 || rectY>=this.getHeight())
                rectY = new Random().nextInt();
        }
        System.out.println(rectX + "," + rectY);
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    int rectX = 10, rectY=10, rectWidth=40, rectHeight=60;
}
