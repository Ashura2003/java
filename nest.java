public class nest {
    static int sVar=5;
    int nsVar=6;

    static class bird{
        static void check(){
        System.out.println(sVar);
    }
    }

    public static void main(String[] args) {
        nest.bird.check();
    }
}
