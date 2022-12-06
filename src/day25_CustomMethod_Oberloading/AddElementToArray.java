package day25_CustomMethod_Oberloading;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        arr = addInteger(arr, 78);

        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        arr2 = addDouble(arr2, 6.5);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D', 'E'};
        arr3 = addChar(arr3, 'F');
        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------------------------");

        String [] names = {"Tarkan", "Osman", "Cemal", "Ali"};
        names = addString(names, "Nehir");
        System.out.println(Arrays.toString(names));

        names = addString(names, "Iglesias");

        System.out.println(Arrays.toString(names));
    }


    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    public static char[] addChar(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;


    }

    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;

        return result;

    }

    }