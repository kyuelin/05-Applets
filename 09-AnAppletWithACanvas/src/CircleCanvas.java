import java.awt.*;
import java.awt.event.*;


public class CircleCanvas extends Canvas implements ActionListener {
	CircleCanvas(Button larger, Button smaller, Button up, Button down, Button left, Button right) {

		this.larger = larger;
		larger.addActionListener(this);

		this.smaller = smaller;
		smaller.addActionListener(this);

		this.up = up;
		up.addActionListener(this);

		this.down = down;
		down.addActionListener(this);

		this.left = left;
		left.addActionListener(this);

		this.right = right;
		right.addActionListener(this);

		setSize(100, 100);

		setBackground(Color.yellow);
	}

	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawOval(upperLeftX, upperLeftY, diameter, diameter);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == larger)
			diameter++;
		else if (e.getSource() == smaller)
			diameter--;
		else if (e.getSource() == up)
			upperLeftY--;
		else if (e.getSource() == down)
			upperLeftY++;
		else if (e.getSource() == left)
			upperLeftX--;
		else
			upperLeftX++;
		repaint();
	}

	Button larger, smaller, up, down, left, right;

	int 
		upperLeftX = 10, 
		upperLeftY = 20, 
		diameter = 10;
}
