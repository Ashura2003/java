public class palindrome{
    public static void main(String[] args){
        int a=515;
        int c=a;
        int reversedn=0;

        for (;a!=0; a /= 10) {
            int digit = a % 10;
            reversedn=reversedn * 10 + digit;
    }

    if(c==reversedn)
    System.out.println(c + " is a palindrome");
    else
    System.out.println(c + " is not a palindrome");
    }
}