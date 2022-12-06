package day09_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        int score = 33;

        String sonuc;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        boolean c = score >= 70 && score <= 79;
        boolean d = score >= 60 && score <= 69;
        boolean e = score <= 59;

        if (a) {
            sonuc = "Excellent";
        } else if (b) {
            sonuc = "Great";
        } else if (c) {
            sonuc = "Good";
        } else if (d) {
            sonuc = "Passed";
        }
        else {
            sonuc = "Failed";
        }

        System.out.println("sonuc = " + sonuc);



    }
}
