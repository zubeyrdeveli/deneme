package day13_Strings;

public class StringIntro {

    public static void main(String[] args) {

        String name1 = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name3);

        System.out.println(name1==name2);
        System.out.println(name1==name4);

        String name5 = new String("Wooden Spoon");
        System.out.println(name5);
        System.out.println("------------------");

        System.out.println(name3==name5);
        System.out.println("-----------------------");

        System.out.println(name3.equals(name5));
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name5));
        System.out.println(name4.equals(name5));


    }
}
