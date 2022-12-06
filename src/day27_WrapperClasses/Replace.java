package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int [] numbers = {2,7,8,6};

        int [] newVersion = replace(numbers,2,50);
        System.out.println(Arrays.toString(newVersion));

        String [] names = {"Ali", "Ahmet", "Ayse", "Zekeriya"};
        names= replace(names,3, "Zeki");

        System.out.println(Arrays.toString(names));

    }

    // replace the element of the array at the given index number with the new element
    public static int [] replace (int [] arr1, int index1, int newElement) {

        if (index1<0||index1> arr1.length-1) {
            System.err.println("invalid index : " + index1);
            System.exit(0);
        }
        arr1 [index1] = newElement;
        return arr1;

    }

    public static String [] replace (String [] arr1, int index1, String newElement) {

        if (index1<0||index1> arr1.length-1) {
            System.err.println("invalid index : " + index1);
            System.exit(0);
        }
        arr1 [index1] = newElement;
        return arr1;

    }

    public static double [] replace (double [] arr1, int index1, double newElement) {

        if (index1<0||index1> arr1.length-1) {
            System.err.println("invalid index : " + index1);
            System.exit(0);
        }
        arr1 [index1] = newElement;
        return arr1;

    }

    public static char [] replace (char [] arr1, int index1, char newElement) {

        if (index1<0||index1> arr1.length-1) {
            System.err.println("invalid index : " + index1);
            System.exit(0);
        }
        arr1 [index1] = newElement;
        return arr1;

    }



}
