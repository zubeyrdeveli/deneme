package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 121;

        boolean evenNumber = number % 2 == 0;
        //boolean oddNumber = number % 2 != 0;

        if (evenNumber) {
            System.out.println(number + " is even number");
        }

        if (!evenNumber) {
            System.out.println(number + " is odd number");
        }
        System.out.println("-------------------------");

        int n = 0;
        boolean positive = n > 0;
        boolean negative = n < 0;
        boolean zero = n == 0;

        if (positive) {
            System.out.println(n + " is positive number");

        }
        if (negative) {
            System.out.println(n + " is negative number");
        }

        if (zero) {
            System.out.println(n + " is zero");
        }


    }
}