import javax.swing.*;

public class carea {
    public static void main(String[] args) {
        int r=Integer.parseInt(JOptionPane.showInputDialog("Enter radius :"));
        area(r);
    }

    public static void area(int r){
        float pi=22/7;
        float carea=pi * r*r;
        System.out.println("The area of the circle is : "+carea);
    }
}
