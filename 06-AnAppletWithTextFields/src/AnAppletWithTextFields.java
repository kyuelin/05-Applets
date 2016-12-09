import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithTextFields extends Applet implements ActionListener {
	public void init() {
		operand1 = new TextField("operand1");
		operator = new TextField("operator");
		operand2 = new TextField("operand2");
		result   = new TextField("result");
		result.setEditable(false);

		calculateEm = new Button("Calculate");
		calculateEm.addActionListener(this);

		add(operand1);
		add(operator);
		add(operand2);
		add(result);
		add(calculateEm);
	}

	public void actionPerformed(ActionEvent e) {
		if (calculateEm == e.getSource()) {
			int o1 = Integer.valueOf(operand1.getText());
			int o2 = Integer.valueOf(operand2.getText());
			switch (operator.getText()) {
				case "+":
					result.setText(String.valueOf(o1+o2));
					break;
				case "-":
					result.setText(String.valueOf(o1-o2));
					break;
				case "*":
					result.setText(String.valueOf(o1*o2));
					break;
				case "/":
					result.setText(String.valueOf(o1/o2));
					break;
				default:
					System.err.println("Invalid Operator");
			}
		}
	}

	TextField operand1, operator, operand2, result;
	Button calculateEm;
}
