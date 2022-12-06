package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9};

        int [] newArr= merge(arr1,arr2);
        System.out.println(Arrays.toString(newArr));

    }

    public static int [] merge (int[] arr1, int [] arr2) {

        int [] result = new int[arr1.length+arr2.length];

        int i = 0;

        for (int each : arr1) {
            result[i++]=each;
        }

        for (int each : arr2) {
            result[i++]=each;
        }

        return result;

    }





}
