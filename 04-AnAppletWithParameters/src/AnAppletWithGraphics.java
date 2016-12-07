import java.applet.*;
import java.awt.*;

public class AnAppletWithGraphics extends Applet {
    public void paint(Graphics g) {
        g.drawLine(0, 0, 100, 100);
        g.setColor(Color.green);
        g.drawRect(10, 30, 20, 60);
        g.setColor(new Color(100, 50, 210));
        g.fillOval(20, 10, 15, 30);
        g.setColor(Color.red);
        g.drawString("Hi There!", 25, 55);
    }
}