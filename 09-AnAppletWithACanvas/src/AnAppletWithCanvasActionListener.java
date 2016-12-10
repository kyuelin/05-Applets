import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnAppletWithCanvasActionListener extends Applet implements ActionListener{
	public void init() {
		Button larger = new Button("Larger");
		larger.addActionListener(this);
		add(larger);

		Button smaller = new Button("Smaller");
		smaller.addActionListener(this);
		add(smaller);

		Button up = new Button("Up");
		up.addActionListener(this);
		add(up);

		Button down = new Button("Down");
		down.addActionListener(this);
		add(down);

		Button left = new Button("Left");
		left.addActionListener(this);
		add(left);

		Button right = new Button("Right");
		right.addActionListener(this);
		add(right);

		add(circleCanvas = new CircleCanvasSimple(larger, smaller, up, down, left, right));

		add(rectCanvas = new RectCanvasSimple(larger, smaller, up, down, left, right));
	}

	Button larger, smaller, up, down, left, right;
	Canvas circleCanvas, rectCanvas;

	@Override
	public void actionPerformed(ActionEvent e) {
        ((CircleCanvasSimple)circleCanvas).actionPerformed(e);
        ((RectCanvasSimple)rectCanvas).actionPerformed(e);
	}
}
