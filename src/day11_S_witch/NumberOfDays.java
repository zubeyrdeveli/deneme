package day11_S_witch;

public class NumberOfDays {
    public static void main(String[] args) {

        int year = 2000;
        int number = 121;
        String result ="";

        if (number >= 1 && number <= 12)  {

            switch (number) {
                case 2:
                    result= (year % 4 == 0)? "29 days" : "28 days";
                    break;
                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;

                default:
                    result = "31 Days";
            }

        }
        else {result = "invalid number";}

        System.out.println("result = " + result);

    }
}