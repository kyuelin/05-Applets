import java.applet.*;
import java.awt.*;

public class AnAppletWithLayout extends Applet {
	public void init() {
		setLayout(new BorderLayout());

		Button topButton = new Button("Top");
		add(topButton, BorderLayout.NORTH);

		Button bottomButton = new Button("Bottom");
		add(bottomButton, BorderLayout.SOUTH);

		Button rightButton = new Button("Right");
		add(rightButton, BorderLayout.EAST);

		Button leftButton = new Button("Left");
		add(leftButton, BorderLayout.WEST);

		Button middleButton = new Button("Middle");
		add(middleButton, BorderLayout.CENTER);
	}
}
