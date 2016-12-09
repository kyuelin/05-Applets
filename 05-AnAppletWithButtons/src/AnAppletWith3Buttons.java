import java.applet.Applet;
import java.awt.*;

public class AnAppletWith3Buttons extends Applet {
    public void init() {
        buttonr = new Button("Red");
        buttonr.setForeground(Color.red);
        this.add(buttonr);

        buttong = new Button("Green");
        buttong.setForeground(Color.green);
        this.add(buttong);

        buttonb = new Button("Blue");
        buttonb.setForeground(Color.blue);
        this.add(buttonb);
    }

    Button buttonr, buttong, buttonb;
}
