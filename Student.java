import java.util.Scanner;

public class Student {

    String FirstName;
    String LastName;
    int age;

    void Details(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First name:");
        FirstName=scan.nextLine();
        System.out.println("Enter Last name:");
        LastName=scan.nextLine();
        System.out.println("Enter Age:");
        age=scan.nextInt();
        System.out.println("Full Name:"+ FirstName + " " + LastName);
        int DOB=2022-age;
        System.out.println("Date of Birth:"+DOB);
    }
    

}
