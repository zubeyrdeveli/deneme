package day13_Strings;

public class StringMethods_Part2 {
    public static void main(String[] args) {

        String str1 = "Wooden Spoon";
        str1 = str1.replace("o","e");

        System.out.println("str1 = " + str1);

        String str9 = "Woodon Spoon";
        str9 = str9.replaceAll("o", "e");
        System.out.println("str9 = " + str9);

        String sentence1 = "I love Java, Java is the best programming language";

        System.out.println("sentence1 = " + sentence1);

        String newversion_replaceFirst = sentence1.replaceFirst("Java", "Phyton");

        System.out.println("newversion_replaceFirst = " + newversion_replaceFirst);

        String newerversion_replace = sentence1.replace("Java", "C#");

        System.out.println("newerversion_replace = " + newerversion_replace);

        String newestversion_replaceAll = sentence1.replaceAll("Java", "Phyton");

        System.out.println("newestversion_replaceAll = " + newestversion_replaceAll);

        String str3 = "Java Programming Language";
        String result1 = str3.substring(str3.indexOf("P"));

        System.out.println("result1 = " + result1);

        String result2 = str3.substring(5);

        System.out.println("result2 = " + result2);

        String result3 = str3.substring(5,16);

        System.out.println("result3 = " + result3);

        String result4 = str3.substring(str3.indexOf("P"), str3.lastIndexOf(" "));

        System.out.println("result4 = " + result4);

        String s1 = "I love Java";

        String result5 = s1.substring(s1.indexOf("l"), s1.lastIndexOf(" "));

        System.out.println("result5 = " + result5);

        String result6 = s1.substring(2,6);

        System.out.println("result6 = " + result6);

        System.out.println("---------------------");

        String str4 = "Java";

        String result7 = str4.repeat(3);

        System.out.println("result7 = " + result7);











    }
}
