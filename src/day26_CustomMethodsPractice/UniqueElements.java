package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,4,1,2,8,9,7,8,7,5,9,6,1};
        int [] unique = uniqueElements(numbers);
        System.out.println(Arrays.toString(unique));

        double [] array = {1.5,7.2,4.2,5,8.1,4.3,1.5,4.2,5};
        double [] uniqueD = uniqueElements(array);
        System.out.println(Arrays.toString(uniqueD));

        String [] names = {"Ali","Ahmet","Ali","Ayşe","Mehmet","Ahmet","Osman","Mehmet","Zeynep"};
        String [] uniqueNames = uniqueElements(names);
        System.out.println(Arrays.toString(uniqueNames));

        char [] chars = {'A','B','C','A','B','D'};
        char [] uniqueChars = uniqueElements(chars);
        System.out.println(Arrays.toString(uniqueChars));

    }

    // returns the unique elements of the array as a new array
    public static int [] uniqueElements (int[] array){

        int [] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1) {
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;


    }

    public static String [] uniqueElements (String[] array){

        String [] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1) {
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;


    }

    public static char [] uniqueElements (char[] array){

        char [] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1) {
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;


    }

    public static double [] uniqueElements (double[] array){

        double [] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each)==1) {
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;


    }




}
