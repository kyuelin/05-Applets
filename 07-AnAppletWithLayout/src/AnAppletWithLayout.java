import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnAppletWithLayout extends Applet implements ActionListener {
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

        for (int i=0; i<12; i++) {
            buttons[i].addActionListener(this);
        }
	}

	Button[] buttons = new Button[12];
    int state=-1; // -1: idle; 0:starting; 1:dialing; 2:calling; 3:ending;
    String phoneNumber="";

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("state = "  + state);
        Button buttonPressed = (Button) e.getSource();
        switch (state) {
            case -1:
                if (buttonPressed == buttons[11]) {
                    state = 0;
                } else {
                    System.out.println("Press '#' twice to start dialing.");
                }
                break;
            case 0:
                if (buttonPressed == buttons[11]) {
                    state = 1;
                } else {
                    System.out.println("Press '#' twice to start dialing.");
                    state = -1;
                }
                break;
            case 1:
                if (phoneNumber.length() == 0) {
                    if (buttonPressed == buttons[1]) {
                        phoneNumber += "1";
                    }
                    else {
                        System.out.println("Please dial a number in the proper format");
                    }
                } else if (phoneNumber.length() < 10 && buttonPressed != buttons[10] && buttonPressed != buttons[11]) {
                    phoneNumber += buttonPressed.getLabel();
                }

                if (phoneNumber.length() == 10) {
                    System.out.println("Phone number " + phoneNumber + " has been dialed.");
                    state = 2;
                    phoneNumber = "";
                }
                break;
            case 2:
                if (buttonPressed == buttons[10]) {
                    state = 3;
                } else {
                    System.out.println("Please don't touch keypad during call");
                }
                break;
            case 3:
                if (buttonPressed == buttons[10]) {
                    System.out.println("End of call");
                    state = -1;
                }
                break;
        }
    }
}
