package day21_ForEachLoop;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        //                0   1  2  3  4
        int [] numbers = {10,20,30,40,50};


            int [] reversed = new int[numbers.length];
            //        j            i
         //  reversed[0] = numbers[4];
        //   reversed[1] = numbers[3];
        //   reversed[2] = numbers[2];
        //   reversed[3] = numbers[1];
        //   reversed[4] = numbers[4];

        for (int i = numbers.length - 1, j =0; i >= 0; i--, j++) {

            reversed [j] =numbers [i];
        }
        System.out.println("reversed = " + Arrays.toString(reversed));






    }
}
