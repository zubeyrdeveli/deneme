package day21_ForEachLoop;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6};

        int [] arr3 = new int[arr1.length + arr2.length];

        int count = 0;

        for (int i : arr1) {
            arr3 [count++] = i;
        }

        for (int i : arr2) {
            arr3 [count++] = i;
        }


        System.out.println("arr3 = " + Arrays.toString(arr3));

        System.out.println("-----------------------");

        String [] group1 = {"Ali", "Ayşe", "Ahmet", "Mehmet", "Zeki", "Onur"};
        String [] group2 = {"Alex", "Tom", "Jerry", "Thomas", "Olga", "Megan"};

        String [] students = new String[group1.length+ group2.length];


        int i = 0;

        for (String s : group1) {
            students [i++] = s;

            System.out.println("s = " + s);
        }

        for (String s : group2) {
            students [i++] = s;
            System.out.println("s = " + s);
        }
        System.out.println("students = " + Arrays.toString(students));

        System.out.println("--------------------------------");


        char [] ch1 = {'A','B','C'};
        char [] ch2 = {'D','E','F','G','H'};

        char [] chars= new char[ch1.length+ ch2.length];

        int j =0;

        for (char c : ch1) {
            chars [j]=c;
            j++;

        }

        for (char c : ch2) {
            chars [j]=c;
            j++;
        }


        System.out.println("chars = " + Arrays.toString(chars));

    }
}
