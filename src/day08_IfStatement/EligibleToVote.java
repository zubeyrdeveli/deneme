package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Zubeyr",
        citizen = "Turkiye";
        int age = 33;

        boolean isEligible = age >= 18 && citizen == "USA";

        //eligible

        if (isEligible) {
            System.out.println(name + " is eligible to vote.");
        }


        //not eligible

        if (!isEligible) {
            System.out.println( name + " is not eligible to vote.");

        }





    }



}
