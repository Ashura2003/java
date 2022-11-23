import java.awt.*;
import javax.swing.*;

public class moreEvent {
    public static void main(String[] args) {
        JFrame jF=new JFrame();
        JTextField textF=new JTextField("Username");
        JTextField textF2=new JTextField("Password");
        JPanel panel=new JPanel();
        JButton btn1=new JButton("Log in to Littleroot Town");
        JButton btn2=new JButton("OldDale Town");
        JButton btn3=new JButton("Petalburg Town");
        JButton btn4=new JButton("RustBoro Town");
        JButton btn5=new JButton("Dewford Town");
        FlowLayout flow=new FlowLayout(FlowLayout.CENTER);
        panel.setLayout(flow);
        panel.add(textF);
        panel.add(textF2);
        panel.add(btn1);
        jF.setLayout(new BorderLayout(10,10));
        jF.add(btn2,BorderLayout.EAST);
        jF.add(btn3, BorderLayout.WEST);
        jF.add(btn4,BorderLayout.SOUTH);
        jF.add(btn5,BorderLayout.NORTH);
        jF.add(panel,BorderLayout.CENTER);
        jF.setSize(300,300);
        jF.setVisible(true);
    }
}
