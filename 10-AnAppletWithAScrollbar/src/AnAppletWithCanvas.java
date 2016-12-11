import java.applet.Applet;
import java.awt.*;

public class AnAppletWithCanvas extends Applet {
	public void init() {
		Scrollbar horizontal = new Scrollbar(Scrollbar.HORIZONTAL, 30, 0, 0, 60);
		add(horizontal);

		Scrollbar vertical = new Scrollbar(Scrollbar.VERTICAL, 30, 0, 0, 60);
		add(vertical);

		Button up = new Button("Up");
		add(up);

		Button down = new Button("Down");
		add(down);

		Button left = new Button("Left");
		add(left);

		Button right = new Button("Right");
		add(right);

		add(new CircleCanvas(horizontal, vertical, up, down, left, right));
	}
}
