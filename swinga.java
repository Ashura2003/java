import javax.swing.*;

public class swinga {
    public static void main(String[] args) {
        JFrame Frame= new JFrame("demo");

        
        JButton btn=new JButton("K cha hau");
        btn.setBounds(50,90,150,20);
        Frame.add(btn);

        JButton btn1=new JButton("testo");
        btn.setBounds(40,90,150,20);
        Frame.add(btn1);

        JButton btn2=new JButton("Kura chai testo po raicha");
        btn.setBounds(60,90,300,20);
        Frame.add(btn2);

        JButton btn3=new JButton("Chammai");
        btn.setBounds(70,90,150,20);
        Frame.add(btn3);

        JButton btn4=new JButton("Saro Garo");
        btn.setBounds(80,90,150,20);
        Frame.add(btn4);


        Frame.setSize(1920,1080);
        Frame.setLayout(null);
        Frame.setVisible(true);
    }
}
