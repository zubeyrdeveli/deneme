package day24_CustomMethods_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {

        nameOfTheMonth(12);


    }

    public static void nameOfTheMonth(int number) {

        if (number<1||number>12) {

            System.out.println("invalid");
            return;
        }


        String name = (number == 1) ? "January" : (number == 2) ? "Feb" : (number == 3) ? "March" : (number == 4) ? "April"
                : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July"
                : (number == 8) ? "August" : (number == 9) ? "Sep" : (number == 10) ? "Octo" : (number == 11) ? "November" : "December";

        System.out.println("name of the month = " + name);
    }
}
