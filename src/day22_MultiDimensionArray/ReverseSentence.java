package day22_MultiDimensionArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";

        String [] words = sentence.split(" ");

        System.out.println("words = " + Arrays.toString(words));

        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }


        System.out.println("reversed = " + reversed);


    }
}
