package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String [] students = {"0-Elif", "1-Ahmet", "2-Mehmet", "3-Zeki", "4-Ülkü", "5-Ceylan", "6-Sevgi", "7-Daniel"};
        String [] earlyBirds = Arrays.copyOf(students, 3);

        System.out.println("earlyBirds = " + Arrays.toString(earlyBirds));

        String [] angryBirds = Arrays.copyOfRange(students, 3,7+1);

        System.out.println("Angry birds : "+Arrays.toString(angryBirds));
        System.out.println();


        int [] numbers = {1,2,3,4,5,6,7,8,9};

        numbers = Arrays.copyOf(numbers,5);

        System.out.println("numbers : " + Arrays.toString(numbers));

        System.out.println("------------------------------");

        //                0  1  2  3  4  5  6  7  8
        int [] scores = {10,20,30,40,50,60,70,80,90};

        int [] fail = Arrays.copyOfRange(scores,0,3);
        int [] pass = Arrays.copyOfRange(scores,3,6);
        int [] excellent = Arrays.copyOfRange(scores,6,scores.length);

        System.out.println("Fail : " + Arrays.toString(fail) + "\n" + "Pass : " + Arrays.toString(pass) + "\n"
                + "Excellent : " + Arrays.toString(excellent) );












    }
}
