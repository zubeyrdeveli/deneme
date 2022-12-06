package day23_CustomMethod_Void;

public class CustomMethodPractice {

    public static void main(String[] args) {
        helloWorld5Times();

        System.out.println("----------------------------");

        helloCydeo5times();
    }


    public static void helloWorld5Times () {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    public static void helloCydeo5times () {

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Wooden Spoon");
        }


        System.out.println("-------------------------------------");

        evenNumbers();
    }



    public static void evenNumbers() {

    for (int i = 2; i < 11; i+=2) {
        System.out.println(i);
    }
}

}
