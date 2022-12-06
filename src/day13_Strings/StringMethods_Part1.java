package day13_Strings;

public class StringMethods_Part1 {

    public static void main(String[] args) {

        String str = "Cydeo";

        char ch1 = str.charAt(2);

        System.out.println("ch1 = " + ch1);

        System.out.println("----------------------");

        String str2 = "Wooden Spoon";

        int uzunluk = str2.length();

        System.out.println("name = " + uzunluk);

        int lastindex = str2.length()-1;

        System.out.println("lastindex = " + lastindex);

        System.out.println("----------------------------");

        String str3 = "JavA";

        str3 = str3.toLowerCase();

        System.out.println("kucukharf = " + str3);

        System.out.println("--------------------------------");

        String str4 = "java";

        str4 = str4.toUpperCase();

        System.out.println("str4 = " + str4);

        System.out.println("-------------");

        String str5 = "     Java Programming Language           ";

        str5 = str5.trim();

        System.out.println("str5 = " + str5);

        System.out.println("------------------");

        String str6 = "Wooden Spoon";

        int indexNumOfFirstO= str6.indexOf('o');

        System.out.println("indexNumOfFirst0 = " + indexNumOfFirstO);

        int indexNumberOfSecondO = str6.indexOf("od");

        System.out.println("indexNumberOfSecondO = " + indexNumberOfSecondO);

        int indexNumberOfThirdO = str6.indexOf("oon");

        System.out.println("indexNumberOfThirdO = " + indexNumberOfThirdO);

        System.out.println("-------------------");

        String str7 = "Wooden Spoon";

        int indexNumberOfLastO = str7.lastIndexOf("o");

        System.out.println("indexNumberOfLastO = " + indexNumberOfLastO);





    }
}
