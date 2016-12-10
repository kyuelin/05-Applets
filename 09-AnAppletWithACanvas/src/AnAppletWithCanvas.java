import java.applet.*;
import java.awt.*;

public class AnAppletWithCanvas extends Applet {
	public void init() {
		Button larger = new Button("Larger");
		add(larger);

		Button smaller = new Button("Smaller");
		add(smaller);

		Button up = new Button("Up");
		add(up);

		Button down = new Button("Down");
		add(down);

		Button left = new Button("Left");
		add(left);

		Button right = new Button("Right");
		add(right);

		add(new CircleCanvas(larger, smaller, up, down, left, right));

		add(new RectCanvas(larger, smaller, up, down, left, right));
	}
}
