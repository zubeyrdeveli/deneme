package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {
        int [] numbers = {1,7,8,9,4,1,2,3,5,7,8,9,4,1};

        numbers= replaceAll(numbers,1,10);

        System.out.println(Arrays.toString(numbers));
    }


    // replaces all the matching old value(elements) of the array with the new value
    public static int [] replaceAll (int [] arr1, int oldElement, int newElement) {

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] == oldElement) {
                arr1 [i] = newElement;
            }

        }
        return arr1;

    }
    public static String [] replaceAll (String [] arr1, String oldElement, String newElement) {

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i].equals(oldElement)) {
                arr1 [i] = newElement;
            }

        }
        return arr1;

    }
    public static double [] replaceAll (double [] arr1, double oldElement, double newElement) {

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] == oldElement) {
                arr1 [i] = newElement;
            }

        }
        return arr1;

    }
    public static char [] replaceAll (char [] arr1, char oldElement, char newElement) {

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] == oldElement) {
                arr1 [i] = newElement;
            }

        }
        return arr1;

    }


}
