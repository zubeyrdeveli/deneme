package day09_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Zachary",
                citizen = "UK";
        int age = 33;

        boolean isEligible = age>18 && citizen=="USA";
        //boolean notEligible = age<18 || citizen != "USA";

        if (isEligible){
            System.out.println(name + " is eligible to vote.");
        } else {
            System.out.println(name + " is NOT eligible to vote");
        }

       /* if (age >= 18) && (citizen == "USA" ){
            System.out.println( name + " is eligible to vote");
        } else {
            System.out.println(name + " is NOT eligible to vote");
        }

        */

    }
}
