import java.awt.*;
import javax.swing.*;

public class mockup {
    public static void main(String[] args) {
        JFrame jF = new JFrame();
        JPanel cP = new JPanel();
        JPanel lP = new JPanel();
        JPanel rP = new JPanel();
        JButton b1 = new JButton("btn1");
        JButton b2 = new JButton("btn2");
        JButton b3 = new JButton("btn3");
        JTextField tF1 = new JTextField();
        JTextField tF2 = new JTextField();
        JTextField tF3 = new JTextField();

        jF.add(cP, BorderLayout.CENTER);
        cP.setLayout(new GridLayout(1,2));
        cP.add(lP);
        cP.add(rP);
        lP.setLayout(new GridLayout(3,1));
        lP.add(b1);
        lP.add(b2);
        lP.add(tF1);
        rP.setLayout(new GridLayout(3,1));
        rP.add(tF2);
        rP.add(tF3);
        rP.add(b3);

        jF.setSize(1000,1000);
        jF.setVisible(true);


    }
}