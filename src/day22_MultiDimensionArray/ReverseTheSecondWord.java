package day22_MultiDimensionArray;

import java.util.Arrays;

public class ReverseTheSecondWord {
    public static void main(String[] args) {

        String str = "I love Java";

        String [] words = str.split(" ");

        System.out.println("words = " + Arrays.toString(words));

        String reverseSecond = ""; //love---->evol

        String secondWord = words[1];

        System.out.println("secondWord = " + secondWord);

        for (int i = secondWord.length()-1; i >= 0; i--) {
            reverseSecond += secondWord.charAt(i);
        }

        System.out.println("reverseSecond = " + reverseSecond);

        // str = str.replaceFirst(words[1],reverseSecond);

        // System.out.println("str = " + str);

        words[1] = reverseSecond;

        System.out.println("str = " + Arrays.toString(words));

        for (String word : words) {
            System.out.print(word + " ");
        }

    }
}
