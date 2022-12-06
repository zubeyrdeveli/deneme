package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int [] arr1 = {1,3,1,2,8,7,6,5,1,2,4,3,5};

        arr1=removeDuplicates(arr1);

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("----------------------------");

        String names [] = {"Ahmet","Mehmet", "Ayse","Mumtaz", "Ahmet", "Ayse", "Zeki"};

        names = removeDuplicates(names);

        System.out.println(Arrays.toString(names));

    }

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] arr1) {

        int[] result = {};

        for (int each : arr1) {
            if (!ArraysUtility.contains(result, each)) {

                result =ArraysUtility.addElement(result,each);

            }
        }

        return result;
    }
    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] arr1) {

        String[] result = {};

        for (String each : arr1) {
            if (!ArraysUtility.contains(result, each)) {

                result =ArraysUtility.addElement(result,each);

            }
        }

        return result;
    }
    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] arr1) {

        char[] result = {};

        for (char each : arr1) {
            if (!ArraysUtility.contains(result, each)) {

                result =ArraysUtility.addElement(result,each);

            }
        }

        return result;
    }
    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] arr1) {

        double[] result = {};

        for (double each : arr1) {
            if (!ArraysUtility.contains(result, each)) {

                result =ArraysUtility.addElement(result,each);

            }
        }

        return result;
    }
}