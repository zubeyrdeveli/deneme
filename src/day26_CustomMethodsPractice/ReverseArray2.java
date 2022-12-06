package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

public class ReverseArray2 {
    // reverse the given array, returns a new reversed version of the given array
    public static int [] reverseArray (int [] arr) {

        int [] result= {};

        for (int i = arr.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,arr[i]);
        }


        return result;

    }
    public static String [] reverseArray (String [] arr) {

        String [] result= {};

        for (int i = arr.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,arr[i]);
        }


        return result;

    }
    public static char [] reverseArray (char [] arr) {

        char [] result= {};

        for (int i = arr.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,arr[i]);
        }


        return result;

    }
    public static double [] reverseArray (double [] arr) {

        double [] result= {};

        for (int i = arr.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,arr[i]);
        }


        return result;

    }



}
