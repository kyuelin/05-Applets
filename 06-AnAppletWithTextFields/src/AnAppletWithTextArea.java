import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kennethlin on 12/8/16.
 */
public class AnAppletWithTextArea extends Applet implements ActionListener {
    public void init () {
        document = new TextArea("document");
        searchFor = new TextField("search for");
        indexOfResult = new TextField("index found");
        indexOfResult.setEditable(false);

        searchEm = new Button("Search");

        add(document);
        add(searchFor);
        add(indexOfResult);
        add(searchEm);
        searchEm.addActionListener(this);
    }

    TextArea document;
    TextField searchFor, indexOfResult;
    Button searchEm;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (searchEm == e.getSource()) {
            indexOfResult.setText(String.valueOf(document.getText().indexOf(searchFor.getText())));
        }
    }
}
