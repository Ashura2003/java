public class SpecialSequence{
    public static void main(String[] args) {
        String str="Astinvone\tdeStarx";
        System.out.println(str);
        String str1="Morning\nshows the\nday";
        System.out.println(str1);
        String str2="And\\OR";
        System.out.println(str2);
        String str3="Carriage\rReturn";
        System.out.println(str3);
        String str4="Wall Street\'s";
        System.out.println(str4);
        String str5="Ujjwal\'Astinvone de Starx'Humagain";
        System.out.println(str5);
        String str6="'Ujjwal'";
        System.out.println(str6);
        System.out.println("Hello Computing \rApple\nWorld");//In this example apple replaces hello 
        /*
        1) It moves the pointer to the start of the line
        2) It replaces the same number of alphabets previously written
        */
        System.out.println("Hello\nComputing \rApple\nWorld");
        System.out.println("Hello\n\rComputing \rApple\nWorld");
    }
}