package day23_CustomMethod_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        oddOrEven(13);

        ageOfPerson(1988);

        printNumbers(20,30);
    }

    public static void oddOrEven (int number){

        if (number % 2 == 0){
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }


    }

    public static void ageOfPerson (int birthYear) {

        int age = 2022-birthYear;
        System.out.println("Your age is : "+ age);
    }

    public static void printNumbers (int x, int y) {

        for (int i = x; i <= y ; i++) {
            System.out.print(i + " ");
        }

    }

}
