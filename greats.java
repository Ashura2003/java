import java.util.Scanner;

class greats{
	public static void main(String[] args) {
		Scanner myInt= new Scanner(System.in);
		System.out.println("Enter a and b:");
		int a=myInt.nextInt();
		int b=myInt.nextInt();

		if (a>50 & a>b){
			System.out.println(a + " is greater than 50 and " + b);	
		}

		else {
			System.out.println(a + " is not greater than both 50 and " + b);
		}
	}
}