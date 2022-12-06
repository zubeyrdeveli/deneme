package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9};

        int [] arr3 = mergeTwoArrays(arr1,arr2);

        System.out.println(Arrays.toString(arr3));

        System.out.println("------------------");

        String [] str1 = {"Ahmet","Nail","Ayse","Mehmet","Kazım","Colin"};
        String [] str2 = {"Sezai"};

        String [] strNew = ArraysUtility.mergeTwoArrays(str1,str2);
        System.out.println(Arrays.toString(strNew));
    }

    public static int [] mergeTwoArrays (int [] array1, int [] array2) {

        int [] result = {};

        for (int each : array1) {
            result=ArraysUtility.addElement(result,each);
        }

        for (int each2 : array2) {
            result=ArraysUtility.addElement(result,each2);
        }

        return result;
    }
}
