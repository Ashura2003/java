public class reversed{
    public static void main (String[] args){
        int a=50;
        int reversedn=0;

        for (;a!=0; a /= 10) {
            int digit = a % 10;
            reversedn=reversedn * 10 + digit;
        }
        System.out.println(reversedn);
    }
}