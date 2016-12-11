import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithScrollbar extends Applet implements AdjustmentListener {
	public void init() {
		scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 50, 0, 0, 100);
		add(scrollbar);
		scrollbar.addAdjustmentListener(this);
		textField = new TextField(3);
		textField.setEditable(false);
		textField.setText(scrollbar.getValue()+"");
		add(textField);
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		textField.setText(scrollbar.getValue()+"");
	}

	Scrollbar scrollbar;
	TextField textField;
}
