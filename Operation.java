import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {

        Math Obj=new Math();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num1=scan.nextInt();
        System.out.println("Enter another number :");
        int num2=scan.nextInt();
        System.out.println("Enter Operation (+,-,*,/) :");
        String operate=scan.nextLine();

        if (operate=="+"){
            int result=Obj.addNumbers(num1,num2);
            System.out.println("The sum of the numbers is "+result);
        }
        else if(operate=="-"){
            int result=Obj.subNumbers(num1,num2);
            System.out.println("The difference of the numbers is "+result);
        }
        else if(operate=="*"){
            int result=Obj.mulNumbers(num1,num2);
            System.out.println("The product of the numbers is "+result);
        }
        else if(operate=="/"){
            int result=Obj.divNumbers(num1,num2);
            System.out.println("The division of the numbers is "+result);
        }
        else{
            System.out.println("Error wrong operator");
        }
    }
    
}
