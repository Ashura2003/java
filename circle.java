public class circle {
    public static void main(String[] args) {
        int capturedValue=areaofCircle(9);
        System.out.println("The area of the circle is : "+capturedValue);
    }

    public static int areaofCircle(int radius){
        int result=22/7*radius*radius;
        return result;
    }
    
}
