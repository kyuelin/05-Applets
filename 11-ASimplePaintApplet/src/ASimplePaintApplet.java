import java.applet.*;
import java.awt.*;

public class ASimplePaintApplet extends Applet {
	public void init() {

		Scrollbar lengthAdjuster = new Scrollbar(Scrollbar.HORIZONTAL, 30, 0, 0, 100);
		TextField lengthDisplay = new TextField(3);
		lengthDisplay.setEditable(false);

		Scrollbar thicknessAdjuster = new Scrollbar(Scrollbar.VERTICAL, 30, 0, 0, 100);
		Button lucky = new Button("Feeling Lucky?");
		TextField thicknessDisplay = new TextField(3);
		lengthDisplay.setEditable(false);

		PaintCanvas paintCanvas = new PaintCanvas(lengthAdjuster, thicknessAdjuster, lucky,
									lengthDisplay, thicknessDisplay);

		setLayout(new BorderLayout());

		add(paintCanvas, BorderLayout.CENTER);

		Panel buttonPanel = new Panel();


		//buttonPanel.setLayout(new GridLayout(0, 1));
		buttonPanel.add(thicknessAdjuster);
		buttonPanel.add(thicknessDisplay);
		buttonPanel.add(lucky);

		add(buttonPanel, BorderLayout.EAST);

		Panel scrollPanel = new Panel();
		scrollPanel.add(lengthAdjuster);
		scrollPanel.add(lengthDisplay);

		add(scrollPanel, BorderLayout.SOUTH);
	}
}
