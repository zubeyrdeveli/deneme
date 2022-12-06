package day21_ForEachLoop;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String [] words = {"Java Programming", "Wooden Spoon", "Earl Birds", "Angry Birds"};

        for (String word : words) {
            System.out.println("word = " + word);
        }

        System.out.println("-------------------------");

        for (String firstAndLast : words) {
            System.out.println("First : " + firstAndLast.charAt(0) + " --> Last : " + firstAndLast.charAt(firstAndLast.length()-1));
        }


    }
}
