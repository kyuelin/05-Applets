import javax.swing.border.Border;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnAppletWithPanels extends Applet implements ActionListener {
    public void init() {
        setLayout(new BorderLayout());

        Panel top = new Panel();
        top.setBackground(Color.green);
        display = new TextField(30);
        display.setEditable(false);
        display.addActionListener(this);
        top.add(display, BorderLayout.EAST);
        add(top, BorderLayout.NORTH);

        Panel bottom = new Panel();
        bottom.setBackground(Color.red);
        bottom.setLayout(new GridLayout(4, 3));

        for (int i = 1; i <= 9; i++) {
            buttons[i] = new Button(String.valueOf(i));
            bottom.add(buttons[i]);
        }
        buttons[10] = new Button("*");
        bottom.add(buttons[10]);
        buttons[0] = new Button("0");
        bottom.add(buttons[0]);
        buttons[11] = new Button("#");
        bottom.add(buttons[11]);
        add(bottom, BorderLayout.CENTER);


        for (int i = 0; i < 12; i++) {
            buttons[i].addActionListener(this);
        }
    }

    Button[] buttons = new Button[12];
    TextField display;

    @Override
    public void actionPerformed(ActionEvent e) {
        Button pressed = (Button) e.getSource();
        display.setText(display.getText() + pressed.getLabel());
        //System.out.println(display.getText());
    }
}
