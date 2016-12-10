import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RectCanvasSimple extends Canvas implements ActionListener {
	RectCanvasSimple(Button larger, Button smaller, Button up, Button down, Button left, Button right) {

		this.larger = larger;

		this.smaller = smaller;

		this.up = up;

		this.down = down;

		this.left = left;

		this.right = right;

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
