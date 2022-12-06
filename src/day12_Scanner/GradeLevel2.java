package day12_Scanner;

public class GradeLevel2 {

    public static void main(String[] args) {

        byte grade = 13;
        String schoolType = "";

        if (grade >= 1 && grade <= 18) {

            switch (grade) {

                case 1: case 2: case 3: case 4: case 5: schoolType = "Elemantary School";
                    break;
                case 6: case 7: case 8: schoolType = "Middle School";
                    break;
                case 9: case 10: case 11: case 12:  schoolType = "High School";
                    break;
                case 13: case 14: case 15: case 16: schoolType = "College";
                    break;
                case 17: case 18: schoolType= "Grad School";

            }

        } else {schoolType = "Invalid Grade";}

        System.out.println("schoolType = " + schoolType);


    }
}
