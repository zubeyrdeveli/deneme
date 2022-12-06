package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in seperate lines
    public static void printEachElement(int[] num1) {

        for (int each : num1) {
            System.out.print(each + " ");
        }
    }
    //prints each String of a string array in seperate lines
    public static void printEachElement(String[] str) {

        for (String each : str) {
            System.out.println(each);
        }
    }
    //prints each double of a double array in seperate lines
    public static void printEachElement(double[] array) {

        for (double each : array) {
            System.out.println(each);
        }
    }
    //prints each chars of a char array in seperate lines
    public static void printEachElement(char[] ch1) {

        for (char each : ch1) {
            System.out.print(each + " ");
        }
    }
    //returns the max number from the given integer array
    public static int printTheMaxNumber(int[] num) {

/*       int max= num[0];
        for (int each : num) {
            if (each>max) {
                max=each;
            }
        }
 */
        Arrays.sort(num);
        return num[num.length - 1];


    }
    //returns the max number from the given double array
    public static double printTheMaxNumber(double[] num) {

        Arrays.sort(num);
        return num[num.length - 1];
    }
    //returns the min number from the given int array
    public static int minNumber (int [] number) {

        Arrays.sort(number);
        return number [0];
    }
    //returns the min number from the given double array
    public static double minNumber (double [] number) {

        Arrays.sort(number);
        return number [0];
    }
    //checks if the given integer is contained in the given array, return boolean (true or false) contains(int [], int )
    public static boolean contains (int [] array, int element) {
        //

        boolean result = false;

        for (int eachElement : array) {
            if (eachElement == element) {
                result = true;
            }
        }
        return result;
    }
    //checks if the given double is contained in the given array, return boolean (true or false) contains(double [], double )
    public static boolean contains (double [] array, double element) {
        //

        boolean result = false;

        for (double eachElement : array) {
            if (eachElement == element) {
                result = true;
            }
        }

        return result;
    }
    //checks if the given String is contained in the given array, return boolean (true or false) contains(String [], String )
    public static boolean contains (String [] array, String element) {
        //

        boolean result = false;

        for (String eachElement : array) {
            if (eachElement.equals(element)) {
                result = true;
            }
        }

        return result;
    }
    //checks if the given char is contained in the given array, return boolean (true or false) contains(char [], char )
    public static boolean contains (char [] array, char element) {
        //

        boolean result = false;

        for (char eachElement : array) {
            if (eachElement==element) {
                result = true;
            }
        }

        return result;
    }
    //this is a return method which can add the given to array, returns the new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }
    //adds a double after the last index of the double array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }
    //add a char after the last index of Char array
    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;


    }
    //adds a String after the last index of the String array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;

        return result;

    }

    //return the frequency of the given element in the given array
    //                                      [1,1,1,1,2,3,4,5]   1
    public static int frequencyOfElement (int [] array, int element) {

        int count = 0;
        for (int each : array) {
            if (each==element) {
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement (char [] array, char element) {

        int count = 0;
        for (char each : array) {
            if (each==element) {
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement (double [] array, double element) {

        int count = 0;
        for (double each : array) {
            if (each==element) {
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement (String [] array, String element) {

        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
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

    //removes an element (the element of which index number entered) from the given array, returns the new array
    public static int [] removeElement (int[] array, int index) {

        if (index<0||index> array.length-1) {
            System.err.println("invalid index: "+ index);
            System.exit(0);
        }

        int [] result = {};

        for (int i = 0; i < array.length; i++) {

            if ( i != index) {
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;




    }
    public static String [] removeElement (String [] array, int index) {

        if (index<0||index> array.length-1) {
            System.err.println("invalid index: "+ index);
            System.exit(0);
        }

        String [] result = {};

        for (int i = 0; i < array.length; i++) {

            if ( i != index) {
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;




    }
    public static char [] removeElement (char[] array, int index) {

        if (index<0||index> array.length-1) {
            System.err.println("invalid index: "+ index);
            System.exit(0);
        }

        char [] result = {};

        for (int i = 0; i < array.length; i++) {

            if ( i != index) {
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;




    }
    public static double [] removeElement (double[] array, int index) {

        if (index<0||index> array.length-1) {
            System.err.println("invalid index: "+ index);
            System.exit(0);
        }

        double [] result = {};

        for (int i = 0; i < array.length; i++) {

            if ( i != index) {
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;




    }

    //merge the given two different arrays and returns the new array
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
    public static String [] mergeTwoArrays (String [] array1, String [] array2) {

        String [] result = {};

        for (String each : array1) {
            result=ArraysUtility.addElement(result,each);
        }

        for (String each2 : array2) {
            result=ArraysUtility.addElement(result,each2);
        }

        return result;
    }
    public static char [] mergeTwoArrays (char [] array1, char [] array2) {

        char [] result = {};

        for (char each : array1) {
            result=ArraysUtility.addElement(result,each);
        }

        for (char each2 : array2) {
            result=ArraysUtility.addElement(result,each2);
        }

        return result;
    }
    public static double [] mergeTwoArrays (double [] array1, double [] array2) {

        double [] result = {};

        for (double each : array1) {
            result=ArraysUtility.addElement(result,each);
        }

        for (double each2 : array2) {
            result=ArraysUtility.addElement(result,each2);
        }

        return result;
    }
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

            if (arr1[i].equals(oldElement) ) {
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
