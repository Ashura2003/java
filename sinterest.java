import javax.swing.*;


public class sinterest {
    public static void main(String[] args) {
        double p=Double.parseDouble(JOptionPane.showInputDialog("Enter principle: ")); 
        int t=Integer.parseInt(JOptionPane.showInputDialog("Enter time: "));
        int r=Integer.parseInt(JOptionPane.showInputDialog("Enter rate: "));
        result(p,t,r);
    }
    

    public static void result(double p, int t,int r){
        double total=p*t*r;
        double resulta=total/100;
        System.out.println("The Simple Interest is : "+resulta);
    }
}
