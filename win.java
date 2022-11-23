import javax.swing.*;

public class win {
    public static void main(String[] args){
        JFrame Frame=new JFrame("Demo");

        JButton btn1=new JButton("btn1");
        JButton btn2=new JButton("btn2");
        JButton btn3=new JButton("btn3");
        JButton btn4=new JButton("btn4");
        JButton btn5=new JButton("btn5");

        btn1.setBounds(200,400,85,30);
        Frame.add(btn1);

        btn2.setBounds(400,400,85,30);
        Frame.add(btn2);

        btn3.setBounds(600,400,85,30);
        Frame.add(btn3);

        btn4.setBounds(800,400,85,30);
        Frame.add(btn4);

        btn5.setBounds(1000,400,85,30);
        Frame.add(btn5);

        JLabel l=new JLabel("Name :");
        JTextField f=new JTextField();
        l.setBounds(40,90,150,20);
        f.setBounds(80,90,150,20);

        Frame.add(l);
        Frame.add(f);

        Frame.setSize(1920,1080);
        Frame.setLayout(null);
        Frame.setVisible(true);
    }
}