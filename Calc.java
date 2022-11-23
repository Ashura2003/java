import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Calc implements ActionListener {
    JTextField tF;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bAdd, bSub, bMul, bDiv, bDec, bClr, bEqls, bDel, bZero, bExit;

    Calc() {
        JFrame calcFrame = new JFrame();
        tF = new JTextField();
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bClr = new JButton("Clear");
        bAdd = new JButton("+");
        bEqls = new JButton("=");
        bSub = new JButton("-");
        bMul = new JButton("*");
        bDec = new JButton(".");
        bDiv = new JButton("/");
        bDel = new JButton("del");
        bZero = new JButton("00");
        bExit = new JButton("Quit");
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bClr.addActionListener(this);
        bAdd.addActionListener(this);
        bEqls.addActionListener(this);
        bDec.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bDel.addActionListener(this);
        bZero.addActionListener(this);
        bExit.addActionListener(this);
        tF.setSize(50, 50);
        calcFrame.add(tF, BorderLayout.NORTH);
        JPanel btPanel = new JPanel();
        GridLayout btn = new GridLayout(4, 5);
        btn.setVgap(5);
        btn.setHgap(5);
        calcFrame.add(btPanel, BorderLayout.CENTER);

        btPanel.setLayout(btn);
        btPanel.add(b1);
        btPanel.add(b2);
        btPanel.add(b3);
        btPanel.add(bDel);
        btPanel.add(bClr);
        btPanel.add(b4);
        btPanel.add(b5);
        btPanel.add(b6);
        btPanel.add(bAdd);
        btPanel.add(bSub);
        btPanel.add(b7);
        btPanel.add(b8);
        btPanel.add(b9);
        btPanel.add(bMul);
        btPanel.add(bDiv);
        btPanel.add(b0);
        btPanel.add(bZero);
        btPanel.add(bDec);
        btPanel.add(bExit);
        btPanel.add(bEqls);
        calcFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        calcFrame.setSize(500, 500);
        calcFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new Calc();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object soucre = e.getSource();
        String text = tF.getText();

        if (soucre == b1) {
            tF.setText(tF.getText() + "1");

        } else if (soucre == b0) {
            tF.setText(tF.getText() + "0");

        } else if (soucre == b2) {

            tF.setText(tF.getText() + "2");

        } else if (soucre == b3) {

            tF.setText(tF.getText() + "3");

        } else if (soucre == b4) {

            tF.setText(tF.getText() + "4");

        } else if (soucre == b5) {
            tF.setText(tF.getText() + "5");
        } else if (soucre == b6) {
            tF.setText(tF.getText() + "6");
        } else if (soucre == b7) {

            tF.setText(tF.getText() + "7");
        } else if (soucre == b8) {

            tF.setText(tF.getText() + "8");

        } else if (soucre == b9) {
            tF.setText(tF.getText() + "9");

        } else if (soucre == bClr) {
            tF.setText("");
        } else if (soucre == bDel) {
            if (text == "") {
                tF.setText("");
            } else if (text != "") {

                tF.setText(text.substring(0, text.length() - 1));
            }
        } else if (soucre == bDec) {
            tF.setText(text + ".");
        } else if (soucre == bAdd) {
            tF.setText(text + "+");
        } else if (soucre == bSub) {
            tF.setText(text + "-");

        } else if (soucre == bMul) {
            tF.setText(text + "*");

        } else if (soucre == bDiv) {
            tF.setText(text + "/");

        } else if (soucre == bZero) {
            tF.setText(text + "00");

        } else if (soucre == bExit) {
            System.exit(0);

        } else if (soucre == bEqls) {
            char[] ary = text.toCharArray();
            String firstNum = "";
            String SecondNum = "";
            String Operand = "";
            double result = 0;

            for (int i = 0; i < ary.length; i++) {
                if (ary[i] >= '0' && ary[i] <= '9' || ary[i] == '.') {
                    if (Operand == "") {
                        firstNum += ary[i];
                    } else {
                        SecondNum += ary[i];
                    }
                }
                if (ary[i] == '+' || ary[i] == 'i' || ary[i] == '*' || ary[i] == '/') {
                    Operand += ary[i];
                }
            }
            if (Operand.equals("+")) {
                result = (Double.parseDouble(firstNum) + Double.parseDouble(SecondNum));
                tF.setText(Double.toString(result));
            }
            if (Operand.equals("-"))
                result = (Double.parseDouble(firstNum) - Double.parseDouble(SecondNum));
            tF.setText(Double.toString(result));

            if (Operand.equals("*"))
                result = (Double.parseDouble(firstNum) * Double.parseDouble(SecondNum));
            tF.setText(Double.toString(result));

            if (Operand.equals("/"))
                result = (Double.parseDouble(firstNum) / Double.parseDouble(SecondNum));
            tF.setText(Double.toString(result));

        }

    }

}