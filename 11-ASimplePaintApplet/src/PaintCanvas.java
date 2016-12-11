import java.awt.*;
import java.awt.event.*;
import java.util.*;

class PaintCanvas extends Canvas implements ActionListener, AdjustmentListener {
	PaintCanvas(Scrollbar lengthAdjuster, Scrollbar thicknessAdjuster, Button lucky,
					TextField lengthDisplay, TextField thicknessDisplay) {

		this.lengthAdjuster = lengthAdjuster;
		this.thicknessAdjuster = thicknessAdjuster;
		this.lucky = lucky;
		this.lengthDisplay = lengthDisplay;
		this.thicknessDisplay = thicknessDisplay;

		lengthAdjuster.addAdjustmentListener(this);
		thicknessAdjuster.addAdjustmentListener(this);
		lucky.addActionListener(this);

		setSize(200, 200);

		centerX = getWidth() / 2;
		centerY = getHeight() / 2;

		length = lengthAdjuster.getValue();

		lengthDisplay.setText(length+"");
		thicknessDisplay.setText(thickness+"");

		setBackground(new Color(15, 150, 200));
	}

	private void adjustThickness(int newThickness) {
		thickness = newThickness;
		if (thickness >=50 ) {
		    thickness = 50;
        }
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
			makeRandomThickness();
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		if (e.getSource() == lengthAdjuster) {
			length = lengthAdjuster.getValue();				// Only one scrollbar, no need for getSource() invocation
			lengthDisplay.setText(length+"");
		}
		else if (e.getSource() == thicknessAdjuster) {
			adjustThickness(thicknessAdjuster.getValue());
		}

		repaint();
	}

	Scrollbar 
		lengthAdjuster,
			thicknessAdjuster;

	TextField
		lengthDisplay,
		thicknessDisplay; 

	int 
		centerX,
		centerY,
		length,
		thickness = 1;

	Button 
		lucky;


}
