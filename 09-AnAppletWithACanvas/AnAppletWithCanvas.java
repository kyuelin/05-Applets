import java.applet.*;
import java.awt.*;

public class AnAppletWithCanvas extends Applet {
	public void init() {
		Button larger = new Button("Larger");
		add(larger);

		Button smaller = new Button("Smaller");
		add(smaller);

		add(new CircleCanvas(larger, smaller));
	}
}
