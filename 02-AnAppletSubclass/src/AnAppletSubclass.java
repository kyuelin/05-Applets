import java.applet.*;
import java.awt.*;

public class AnAppletSubclass extends Applet {
    public void init() {
        System.err.println("Hello from AnAppletSubClass.init - the current value of n is " + n);

        String rParam =  getParameter("rValue");
        int rValue = Integer.parseInt(rParam);
        String gParam =  getParameter("gValue");
        int gValue = Integer.parseInt(gParam);
        String bParam =  getParameter("bValue");
        int bValue = Integer.parseInt(bParam);

        color = new Color(rValue, gValue, bValue);
    }
    public void paint(Graphics g) {
        setBackground(color);
        if (n%2 == 0) {
            color = Color.RED;
        }
        else {
            color = Color.cyan;
        }

        System.err.println("Hello from AnAppletSubClass.paint-- the current value of n is " + n);
        n++;
        repaint();
    }

    Color color;
    int n = 0;
}