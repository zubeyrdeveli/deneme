package day13_Strings;


import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName = "Wooden";
        String lastName = "Spoont";

        System.out.println(firstName.charAt(0) + "." + (lastName.charAt(0)));
        System.out.println("----------------------------");
        System.out.println(firstName.charAt(firstName.length()-1)+"."+(lastName.charAt(lastName.length()-1)));
        System.out.println("--------------------");

        String isim = "zeki bey";

        char harf = isim.charAt(0);
        System.out.println("harf = " + harf);

        int kacIndex = isim.length();
        System.out.println("kacIndex = " + kacIndex);

        char lastChar = isim.charAt(isim.length()-1);

        System.out.println("lastChar = " + lastChar);

        input.close();



    }
}
