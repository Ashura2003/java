import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class eve extends Frame implements ActionListener{
    TextField textField;
    eve()
    {
        textField=new TextField();
        textField.setBounds(60,50,170,20);
        Button btn = new Button("Reset");
        btn.setBounds(90,140,75,40);
        btn.addActionListener(this);
        add(btn);
        add(textField);
        setSize(250,250);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        textField.setText("");
    }
    

    public static void main(String[] args) {
        new eve();
    }
}