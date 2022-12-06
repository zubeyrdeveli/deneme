package day09_IfStatement;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2022;

        boolean leapyear = year % 4 == 0;

        /* if (leapyear){
            System.out.println( year + " is a leap year");
        }
        if (!leapyear){
            System.out.println(year + " is NOT a leap year");
        }

         */

        System.out.println("-----------------------");

        if (leapyear) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + " is NOT a leap year");
        }

    }

}
