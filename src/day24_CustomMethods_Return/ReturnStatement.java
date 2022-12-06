package day24_CustomMethods_Return;

public class ReturnStatement {

    public static void main(String[] args) {
        nameOfTheDay(6);
    }

    public static void nameOfTheDay(int number) {

        String name = "";

        if (number < 1 || number > 7) {

            System.out.println("invalid");
            return;

        }
            name = number == 1 ? "Monday" : number == 2 ? "Tuesday" : number == 3 ? "Wed" : number == 4 ? "Thursday"
                    : number == 5 ? "Friday" : number == 6 ? "Saturday" : "Sunday";

        System.out.println("name = " + name);
    }
}