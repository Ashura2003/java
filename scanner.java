import javax.swing.*;

public class scanner {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for subject 1: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for subject 2: "));
        int n3=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for subject 3: "));
        int n4=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for subject 4: "));
        int total=n1+n2+n3+n4;
        int percentage=total/4;
        System.out.println("Total : " +total);
        System.out.println("Percentage : "+percentage + "%");
    }
    
}
