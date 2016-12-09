import java.applet.*;
import java.awt.*;

public class AnAppletWithLayout extends Applet {
	public void init() {
		setLayout(new GridLayout(4,3));

		for (int i=1; i<=9; i++) {
			buttons[i] = new Button(String.valueOf(i));
			add(buttons[i]);
		}
		buttons[10] = new Button("*");
		add(buttons[10]);
		buttons[0] = new Button("0");
		add(buttons[0]);
		buttons[11] = new Button("#");
		add(buttons[11]);
	}

	Button[] buttons = new Button[12];
}
