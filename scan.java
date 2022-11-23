import java.util.Scanner;


class scan{
	public static void main(String[] args) {
		Scanner scannerObj=new Scanner(System.in);
		//Student student1=new Student("Shreejan","Maharjan","shreejanm21@gmail.com");
		System.out.println("Enter name,age and Salary :");
		String name=scannerObj.nextLine();
		int age=scannerObj.nextInt();
		double salary=scannerObj.nextDouble();

		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
	}
}