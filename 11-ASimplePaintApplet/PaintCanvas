import java.awt.*;
import java.awt.event.*;
import java.util.*;

class PaintCanvas extends Canvas implements ActionListener, AdjustmentListener {
	PaintCanvas(Scrollbar lengthAdjuster, Button thicker, Button thinner, Button lucky,
					TextField lengthDisplay, TextField thicknessDisplay) {

		this.lengthAdjuster = lengthAdjuster;
		this.thicker = thicker;
		this.thinner = thinner;
		this.lucky = lucky;
		this.lengthDisplay = lengthDisplay;
		this.thicknessDisplay = thicknessDisplay;

		lengthAdjuster.addAdjustmentListener(this);
		thicker.addActionListener(this);		
		thinner.addActionListener(this);		
		lucky.addActionListener(this);		

		setSize(200, 200);

		centerX = getWidth() / 2;
		centerY = getHeight() / 2;

		length = lengthAdjuster.getValue();

		lengthDisplay.setText(length+"");
		thicknessDisplay.setText(thickness+"");

		setBackground(new Color(15, 150, 200));
	}

	private void makeThicker() {
		thickness += 1;
		thicknessDisplay.setText(thickness+"");
		repaint();
	}

	private void makeThinner() {
		thickness -= 1;
		thicknessDisplay.setText(thickness+"");
		repaint();
	}

	private void makeRandomThickness() {
		Random random = new Random();
		thickness = random.nextInt(20)+1;
		thicknessDisplay.setText(thickness+"");
		repaint();
	}

	public void paint(Graphics g) {
		for (int i = 0; i < thickness; i++)			// Draw 'thickness' number of adjacent lines
			g.drawLine(centerX-(length/2), centerY+i, centerX+(length/2), centerY+i);			
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == thicker)
			makeThicker();
		else if (e.getSource() == thinner)
			makeThinner();
		else
			makeRandomThickness();
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		length = lengthAdjuster.getValue();				// Only one scrollbar, no need for getSource() invocation
		lengthDisplay.setText(length+"");
		repaint();
	}

	Scrollbar 
		lengthAdjuster;

	TextField
		lengthDisplay,
		thicknessDisplay; 

	int 
		centerX,
		centerY,
		length,
		thickness = 1;

	Button 
		thicker,
		thinner,
		lucky;


}
