import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kennethlin on 12/10/16.
 */
public class AnAppletWithKeyboard extends Applet implements ActionListener {
    public void init() {
        setLayout(new BorderLayout());

        Panel top = new Panel();
        top.setBackground(Color.green);
        display = new TextField(40);
        display.setEditable(false);
        display.addActionListener(this);
        top.add(display);
        add(top, BorderLayout.NORTH);

        Panel bottom = new Panel();
        bottom.setBackground(Color.red);

        Panel topRowPanel = new Panel();
        String row = "QWERTYUIOP";
        for (int i =0; i<row.length(); i++) {
            Button button = new Button(row.substring(i,i+1));
            button.addActionListener(this);
            topRowPanel.add(button);
        }
        bottom.add(topRowPanel);

        Panel midRowPanel = new Panel();
        row = "ASDFGHJKL";
        for (int i =0; i<row.length(); i++) {
            Button button = new Button(row.substring(i,i+1));
            button.addActionListener(this);
            midRowPanel.add(button);
        }
        bottom.add(midRowPanel);

        Panel botRowPanel = new Panel();
        row = "^ZXCVBNM<";
        for (int i =0; i<row.length(); i++) {
            Button button = new Button(row.substring(i,i+1));
            button.addActionListener(this);
            botRowPanel.add(button);
        }
        bottom.add(botRowPanel);

        add(bottom, BorderLayout.CENTER);
    }


    Button[] buttons = new Button[28];
    TextField display;
    boolean shift;

    @Override
    public void actionPerformed(ActionEvent e) {
        Button pressed = (Button) e.getSource();
        String output = display.getText();
        if (pressed.getLabel().equalsIgnoreCase("^")) {
            if (shift == true) {
                shift = false;
                pressed.setForeground(Color.gray);
            }
            else {
                shift = true;
                pressed.setForeground(Color.green);
            }
        }
        else if (pressed.getLabel().equalsIgnoreCase("<")) {
            output = output.substring(0, output.length()-1);
        }
        else {
            if (false == shift) {
                output += pressed.getLabel().toLowerCase();
            }
            else {
                output += pressed.getLabel();
            }
        }
        display.setText(output);
    }
}
