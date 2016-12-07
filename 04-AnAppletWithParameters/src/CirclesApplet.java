import java.applet.Applet;
import java.awt.*;

/**
 * Created by kennethlin on 12/7/16.
 */
public class CirclesApplet extends Applet {
    public void init() {
        String param1 = getParameter("quantity");
        quantity = Integer.parseInt(param1);
        String param2 = getParameter("diameter");
        diameter = Integer.parseInt(param2);
    }

    public void paint(Graphics g) {
        int x = 5;
        int y = 25;
        g.drawOval(x, y, diameter, diameter);
        for (int i = 0; i < quantity; i++) {
            g.drawOval(x, y, diameter, diameter);
            x+=diameter;
        }
    }

    int quantity, diameter;
}