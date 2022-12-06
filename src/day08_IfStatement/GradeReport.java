package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

        int score = 170;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        boolean c = score >= 70 && score <= 79;
        boolean d = score >= 60 && score <= 69;
        boolean e = score <= 59;

        if (a) {
            System.out.println("Excellent");
        }

        if (b) {
            System.out.println("Great");

        }

        if(c) {
            System.out.println("Good");

        }
        if (d) {
            System.out.println("Passed");
        }

        if (e) {
            System.out.println("Failed");
        }





    }


}
