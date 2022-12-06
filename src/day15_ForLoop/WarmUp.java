package day15_ForLoop;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.nextLine();

        if (word.startsWith("x")) {word=word.replaceFirst("x","a");}

        System.out.println(word);
        System.out.println("-----------------------");

        System.out.println("Enter a word:");
        String word2 = input.nextLine();

        word2 = word2.replace("x","a").replace("X", "a");

        System.out.println(word2);

    }
}
