public class comdo{
	public static void main(String[] args) {
		int _var=2,_var1=1,result;
		result=_var1+ ++_var;

		System.out.println("The value of _var is "+ _var);
		System.out.println("The value of result is "+ result);

		result=_var1 + _var++;

		System.out.println("The value of _var is "+ _var);
		System.out.println("The value of result is "+ result);
	}
}