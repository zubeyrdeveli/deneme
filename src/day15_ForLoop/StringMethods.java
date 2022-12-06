package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str = "   ";

        boolean r = str.isEmpty();

        System.out.println("r = " + r);

        boolean t = str.isBlank();

        System.out.println("t = " + t);

        System.out.println("------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        String s3 = "CyDeO";

        System.out.println("equals? :"+ s1.equals(s2));
        System.out.println("equalsIgnoreCase? :" + s1.equalsIgnoreCase(s2));
        System.out.println("equalsIgnoreCase? :" + s2.equalsIgnoreCase(s3));

        System.out.println("-------------------------");

        String sentence = "My favourite programming language is JaVa";

        boolean x = sentence.contains("Java");
        System.out.println("x = " + x);

        boolean y = sentence.contains("C#");
        System.out.println("y = " + y);

        boolean hasJava = sentence.contains("Java") || sentence.contains("java");
        System.out.println("hasJava = " + hasJava);

        boolean z = sentence.toLowerCase().contains("java");
        System.out.println("z = " + z);

        System.out.println("------------------------");

        String a = "Wooden Spoon";

        boolean f = a.startsWith("woo");
        System.out.println("f = " + f);

        boolean g = a.startsWith("Woo");
        System.out.println("g = " + g);

        boolean h = a.endsWith("n");
        System.out.println("h = " + h);

        boolean k = a.toLowerCase().startsWith("w");
        System.out.println("k = " + k);










    }

}
