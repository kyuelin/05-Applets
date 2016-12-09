import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithButtons extends Applet implements ActionListener {
    public void init() {
        button1 = new Button("Button 1");
        add(button1);
        button1.addActionListener(this);

        button2 = new Button("Button 2");
        add(button2);
        button2.addActionListener(this);

        setBackground(Color.orange);
    }

    public void actionPerformed(ActionEvent e) {
        button1Or2 = (Button) e.getSource();
        if (button1Or2 == button1) {
            if (maxX <= 0 || maxY <=0 ) {
                maxX = this.getWidth();
                maxY = this.getHeight();
            }
            else {
                maxX -= 5;
                maxY -= 5;
            }
            System.out.println("Button 1 was pressed");
        } else {
            if (maxH <= 0) {
                maxH = this.getHeight();
            }
            else {
                maxH -= 5;
            }
            System.out.println("Button 2 was pressed");
        }
        repaint();
    }

    public void paint(Graphics g) {
        if (button1 == button1Or2) {
            g.drawLine(0, 0, maxX, maxY);
        } else if (button2 == button1Or2) {
            g.drawOval(0,0, this.getWidth(), maxH);
        }
    }

    Button button1, button2, button1Or2;
    int maxX = this.getWidth();
    int maxY = this.getHeight();
    int maxH = this.getHeight();
}
