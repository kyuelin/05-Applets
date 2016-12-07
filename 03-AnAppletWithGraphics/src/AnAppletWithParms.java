import java.applet.*;
import java.awt.*;

public class AnAppletWithParms extends Applet {
    public void init() {
        String oParm1 =  getParameter("operand1");
        o1 = Integer.parseInt(oParm1);
        String oParm2 =  getParameter("operand2");
        o2 = Integer.parseInt(oParm2);
        o3 =  getParameter("operator");
    }

    public void paint(Graphics g) {
        switch (o3) {
            case "+":
                result=o1+o2;
                break;
            case "-":
                result=o1-o2;
                break;
            case "*":
                result=o1*o2;
                break;
            case "/":
                result=o1/o2;
                break;
        }
        System.out.println("result = " + result);
    }

    int o1,o2,result;
    String o3;
}