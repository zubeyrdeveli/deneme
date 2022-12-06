package day20_Arrays;

public class MinimumNumberOfArray {
    public static void main(String[] args) {

        int [] numbers = {10, 20, 5, 55, 11, 22, 77};

        int minimum = numbers [0]; // zero'daki index == 10

        for (int i = 0; i < numbers.length; i++){

            if (numbers[i]< minimum) {

                minimum = numbers[i];
            }

        }
        System.out.println(minimum);

    }
}
