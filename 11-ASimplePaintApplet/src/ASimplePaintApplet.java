import java.applet.*;
import java.awt.*;

public class ASimplePaintApplet extends Applet {
	public void init() {

		Scrollbar lengthAdjuster = new Scrollbar(Scrollbar.HORIZONTAL, 30, 0, 0, 100);
		TextField lengthDisplay = new TextField(3);
		lengthDisplay.setEditable(false);
		TextField thicknessDisplay = new TextField(3);
		thicknessDisplay.setEditable(false);
		Button thicker = new Button("Thicker");
		Button thinner = new Button("Thinner");
		Button lucky = new Button("Feeling Lucky?");
		PaintCanvas paintCanvas = new PaintCanvas(lengthAdjuster, thicker, thinner, lucky,
									lengthDisplay, thicknessDisplay);


		setLayout(new BorderLayout());

		add(paintCanvas, BorderLayout.CENTER);

		Panel buttonPanel = new Panel();
		buttonPanel.setLayout(new GridLayout(0, 1));
		buttonPanel.add(thinner);
		buttonPanel.add(thicknessDisplay);
		buttonPanel.add(thicker);
		buttonPanel.add(lucky);

		add(buttonPanel, BorderLayout.EAST);

		Panel scrollPanel = new Panel();
		scrollPanel.add(lengthAdjuster);
		scrollPanel.add(lengthDisplay);

		add(scrollPanel, BorderLayout.SOUTH);
	}
}
