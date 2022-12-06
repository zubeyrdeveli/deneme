package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {

        String [] names = {"Ahmet","Nail","Ayse","Mehmet","Kazım","Colin"};
        names= ArraysUtility.removeElement(names,3);
        System.out.println(Arrays.toString(names));

        double [] arr1 = {1.2,3.3,4.4,5.5};
        arr1=ArraysUtility.removeElement(arr1,2);
        System.out.println(Arrays.toString(arr1));

        char [] ch1 = {'F','G','V','B','K','Z'};
        ch1=ArraysUtility.removeElement(ch1,4);
        System.out.println(Arrays.toString(ch1));


    }
}
