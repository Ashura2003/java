public class remarks{
	public static void main(String[] args) {
		int marks=90;

		if (marks>=95){
			System.out.println("Student is brilliant");
		}
		else if(marks>=80){
			System.out.println("Student is above average");	
		}
		else if(marks>80 & marks>=60){
			System.out.println("Student is below average");
		}
		else if(marks>60 & marks<80){
			System.out.println("Student is below average");
		}
		else if(marks<30){
			System.out.println("Student is poor");	
		}
		else {
			System.out.println("Pay bill");
		}
	}
}