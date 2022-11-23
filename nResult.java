import java.util.Scanner;

class nResult{
	public static void main(String[] args) {
		Scanner myMarks = new Scanner(System.in);
		System.out.println("Enter marks of English, Science, Maths and Computer : ");
		float eng=myMarks.nextFloat();
		float sci=myMarks.nextFloat();
		float maths=myMarks.nextFloat();
		float comp=myMarks.nextFloat();

		float total=eng+sci+maths+comp;
		float result=total/4;

		if (result >=70 ){
			System.out.println("First Class");
		}
		else if(result>59){
			System.out.println("Upper Second Class");
		}
		else if(result>49){
			System.out.println("Second Class");
		}
		else if(result>39){
			System.out.println("Third Class");
		}
		else {
			System.out.println("Fail");	
		}
	}
}