package day13_Strings;

public class StringMethods_Part3 {
    public static void main(String[] args) {

        String str1 = "   ";

        boolean r1= str1.isEmpty();

        System.out.println("r1 = " + r1);

        System.out.println("------------");

        String str2 = "     ";

        boolean r2 = str2.isBlank();

        System.out.println("r2 = " + r2);

        System.out.println("-------------");

        String str3 = "Java";
        String str4 = new String("Java");

        System.out.println (str3==str4);

        boolean r3 = str3.equals(str4);

        System.out.println("r3 = " + r3);

        System.out.println("----------------");

        String word1 = "JAVA";
        String word2 = "java";

        boolean r35 =word1.equals(word2);
        System.out.println("r35 = " + r35);

        boolean r4 = word1.equalsIgnoreCase(word2);
        System.out.println("r4 = " + r4);

        System.out.println("---------------");

        String sentence = "I love Java Programming";

        boolean r5 = sentence.contains("lovee");

        System.out.println("r5 = " + r5);

        System.out.println("---------");

        String name = "Wooden Spoon";

        boolean r6= name.startsWith("W");

        System.out.println("r6 = " + r6);

        System.out.println("----------");

        String surname = "Wooden Spoon";

        boolean r7 = surname.endsWith("n");

        System.out.println("r7 = " + r7);


    }
}
