package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,56,7};

        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------");

        int [] scores = {15,33,44,13,21,5,2,55,66, 21};

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        System.out.println("Min number: " + scores[0]);
        System.out.println("Max number: " + scores[scores.length-1]);

        System.out.println("-----------------");

        String [] names = {"Zubeyir", "Talha", "Ersin", "Ahmet", "Mehmet", "Veli"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("----------------------------------------------------------");

        int arr1 [] = {1,2,3};
        int arr2 [] = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println("r1 = " + r1);

        System.out.println(Arrays.equals(arr1,arr2));

        System.out.println("-----------------------------------");

        char [] ch1 = {'a', 'c', 'b'};
        char [] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println("Anagram? : " + Arrays.equals(ch1,ch2));






    }
}
