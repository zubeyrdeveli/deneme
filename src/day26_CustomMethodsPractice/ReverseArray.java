package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] reversedVers= reverse(arr);
        System.out.println(Arrays.toString(reversedVers));


    }
    // reverse the given array, returns a new reversed version of the given array

    //                              {1,2,3,4,5}
    public static int [] reverse (int [] arr1) {

        int [] result = new int[arr1.length];

        for (int i = arr1.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=arr1 [i];
        }
        return result;
    }



}
