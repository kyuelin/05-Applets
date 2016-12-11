import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public class CircleCanvas extends Canvas implements AdjustmentListener, ActionListener {
    CircleCanvas(Scrollbar horizontal, Scrollbar vertical, Button up, Button down, Button left, Button right) {

        this.horizontal = horizontal;
        horizontal.addAdjustmentListener(this);

        this.vertical = vertical;
        vertical.addAdjustmentListener(this);

        this.up = up;
        up.addActionListener(this);

        this.down = down;
        down.addActionListener(this);

        this.left = left;
        left.addActionListener(this);

        this.right = right;
        right.addActionListener(this);

        setSize(100, 100);

        setBackground(Color.yellow);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawOval(upperLeftX, upperLeftY, width, height);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == up)
            upperLeftY--;
        else if (e.getSource() == down)
            upperLeftY++;
        else if (e.getSource() == left)
            upperLeftX--;
        else
            upperLeftX++;
        repaint();
    }

    Scrollbar horizontal, vertical;
    Button up, down, left, right;

    int
            upperLeftX = 10,
            upperLeftY = 20,
            width = 30,
            height = 30;

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        if (e.getSource() == horizontal) {
            width=horizontal.getValue();
        }
        else if (e.getSource() == vertical) {
            height= vertical.getValue();
        }
        repaint();
        System.out.println("width:"+ width +  " height:" + height);
    }
}
