package day11_S_witch;

public class Grade3 {

    public static void main(String[] args) {

        char grade = 'D';
        String result = "";

        switch (grade) {

            case 'A':
                result = "Excellent";
                break;

            case 'B':
                result = "Great";
                break;

            case 'C':
                result = "Good";
                break;

            case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";

        }
        System.out.println("result = " + result);
    }
}
