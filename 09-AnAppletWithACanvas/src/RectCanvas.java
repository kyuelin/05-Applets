import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RectCanvas extends Canvas implements ActionListener {
	RectCanvas(Button larger, Button smaller, Button up, Button down, Button left, Button right) {

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
		g.drawRect(upperLeftX, upperLeftY, width, height);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == larger) {
			height++;
			width++;
		}
		else if (e.getSource() == smaller) {
			width--;
			height--;
		}
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
		width = 10,
		height = 20;
}
