import java.applet.Applet;
import java.awt.*;

/**
 * Created by kennethlin on 12/7/16.
 */
public class SmileyApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(25,25,100,100);
        g.setColor(Color.blue);
        g.fillOval(45,50,25,25);
        g.fillOval(80,50,25,25);
        arcAngle*=n;
        g.drawArc(40,90,60,10,0,arcAngle);
        repaint();
    }
    int n=-1;
    int arcAngle=120;
}