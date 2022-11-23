public class ternery{
    public static void main(String[] args){
        short temp=41;
        String decision;
        String Decision;
        String result;
        
        decision=(temp>20) ? "Wear Tank Top":"Wear Jacket";
        System.out.print(decision);

        boolean rain=true;
        boolean nrain=false;

        Decision=(rain==true) ? "Umbrella":"Sunglasses";
        System.out.println(Decision);

        int exam=50;

        result=(exam>49) ? "Pass":"Fail";
        System.out.println(result);
        
    }
     
}