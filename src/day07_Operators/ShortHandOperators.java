package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //assignment

        int number = 100;

        System.out.println("number = " + number); // 100

        number = 200;

        System.out.println("number = " + number); // 200

        System.out.println("-----------------------------");

        String word = "Zumra";

        System.out.println("word = " + word); // Zumra

        word = "Tarik";

        System.out.println("word = " + word); // Tarik

        word = "Tuba";

        System.out.println("word = " + word);

        //Addition Assignment:
        System.out.println("--------------------");

        int x = 100;

        System.out.println("x = " + x);

        x += 200;

        System.out.println("x = " + x);

        int y = 40;

        y += 33;


        System.out.println("y = " + y);

        String kuzen = "Ahmet,";

        kuzen += " Furkan,";

        kuzen += " Zeynep";

        System.out.println("kuzen = " + kuzen);

        //Subtraction Assignment

        System.out.println("----------------------");

        int para = 250;

        System.out.println("para = " + para);

        para -= 30;

        System.out.println("para = " + para);

        System.out.println("----------------------");

        //Multiplication Assignment

        para *= 2;

        System.out.println("para = " + para);

        //Division Assignment

        para /= 4;

        System.out.println("para = " + para);

        //Remainder Assignment

        para %= 3;

        System.out.println("para = " + para);


    }
}
