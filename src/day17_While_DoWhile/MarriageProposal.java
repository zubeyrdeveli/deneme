package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = input.next().toLowerCase();

        while ( !(answer.equals("yes") || answer.equals("no")  )){

            System.err.println("Invalid answer, please input Yes or No");
            answer=input.next();
        }
        if (answer.equals("yes")){
            System.out.println("Congrats!");
        } else {
            System.out.println("please try again later");
        }
    }
}
