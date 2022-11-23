public class swap{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
        System.out.println("This is the value in first variable " +a);
        System.out.println("This is the value in second variable " +b);
        c=a;
        a=b;
        b=c;
        System.out.println("This is the value in first variable after swaping " +a);
        System.out.println("This is the value in second variable after swaping " +b);

        int[] temp = {1,2,3,4,5};
        System.out.println(temp);
    }
}