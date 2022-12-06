package day11_S_witch;

public class Grade4 {
    public static void main(String[] args) {

        char grade = 'A';
        String result = "";
        switch (grade) {

            case'A' : case'B': case'C': case 'D':
                result= "Passed";
            break;

            case 'F':
                result = "Failed";
                break;

            default: result = "Invalid";

        }
        System.out.println("result = " + result);

    }
}
