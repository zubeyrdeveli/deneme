package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 65;

        boolean two = number % 2 == 0;
        boolean three = number % 3 == 0;
        boolean five = number % 5 == 0;

        System.out.println(number + " is divisible by 2: " + two);
        System.out.println(number + " is divisible by 3: " + three);
        System.out.println(number + " is divisible by 5: " + five);



    }


}
