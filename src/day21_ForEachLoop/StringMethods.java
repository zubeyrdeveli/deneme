package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";

        char [] chars = str.toCharArray();

        System.out.println("chars = " + Arrays.toString(chars));

        System.out.println("--------------------");



        for (char each : str.toCharArray()) {
            System.out.println("each = " + each);
        }

        System.out.println("------------------------------------------------------------");

        String sentence = "Wooden Spoon";

        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------");

        String email = "zubeyirdeveli@hotmail.com";

        String [] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------");

        String s = "Today is Sunday. I would like to go outside. But I can't. Becuse I'm studying.";

        String [] splt = s.split("\\. ");

        System.out.println(Arrays.toString(splt));

    }
}
