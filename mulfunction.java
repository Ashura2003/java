import javax.swing.*;

public class mulfunction{
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
        int n3=Integer.parseInt(JOptionPane.showInputDialog("Enter third number: "));
        int result=mul(n1,n2,n3);
        System.out.println("The product of the numbers are : "+result);

    }

    public static int mul(int n1,int n2, int n3){
        int pro=n1*n2*n3;
        return(pro);
    }
}