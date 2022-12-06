package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

        int [] numbers = {10, 0, 20, 30, 1, 99, 44, 55, 60};

        int maxNumber = numbers [0];

        for (int each : numbers) {
            if (each>maxNumber) {
                maxNumber=each;
            }
        }

        System.out.println(maxNumber);


    }
}
