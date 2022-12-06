package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;
        if (n%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("-----------------");

        String result = (n % 2 == 0)? "Even" : "Odd";

        System.out.println("result = " + result);

        System.out.println("-------------------");

        int age= 33;

        if (age >= 18){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("NOT eligible to buy alcohol");
        }
        System.out.println("-----------------");

        String IsEligible = (age>=18)? "Eligible":"Not Eligible";

        System.out.println("IsEligible = " + IsEligible);

        System.out.println("-----------------------");

        int number = -10;

        if (number>0) {
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }

        System.out.println((number>0)? "pozitif":(number<0)? "negatif" : "zero");

        String result3 = (number>0)? "pozitivee":(number<0)? "negativee" : "zerooo";

        System.out.println("result3 = " + result3);


    }

}
