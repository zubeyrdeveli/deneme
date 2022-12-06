package day25_CustomMethod_Oberloading;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int [] num1 = {1,2,3,4,5,6,7};

        ArraysUtility.printEachElement(num1);

        System.out.println("-");
        System.out.println("----------------------");

        String [] str = {"Ahmet","Nail","Ayse","Mehmet","Kazım","Colin"};

        ArraysUtility.printEachElement(str);

        System.out.println("-----------------------------");

        double [] arr1 = {1.2,3.3,4.4,5.5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("-----------------------");

        char [] ch1 = {'F','G','V','B','K','Z'};
        ArraysUtility.printEachElement(ch1);

        System.out.println("-");
        System.out.println("-------------------------");

        int [] numbers = {1,5,77,9,81,65,22};
        int max = ArraysUtility.printTheMaxNumber(numbers);
        System.out.println("maxInt = " + max);

        double [] dnumbers = {15.5,5.7,9,16,15.9};
        double maxdoub = ArraysUtility.printTheMaxNumber(dnumbers);
        System.out.println("maxdoub = " + maxdoub);

        int [] numbers1 = {1,5,77,9,81,65,22};

        int min = ArraysUtility.minNumber(numbers1);

        System.out.println("minInt = " + min);

        double [] dnumbers1 = {15.5,5.7,9,16,15.9};
        double mindoub = ArraysUtility.minNumber(dnumbers1);
        System.out.println("mindoub = " + mindoub);

        System.out.println("-------------------------");

        int [] array = {1,2,3,4,5,8,9};

        boolean contain6 = ArraysUtility.contains(array,6);

        System.out.println(contain6);

        double [] dnumbers2 = {15.5,5.7,9,16,15.9};
        boolean contain = ArraysUtility.contains(dnumbers2,5.7);

        System.out.println(contain);
        
        String [] names = {"Ahmet","Nail","Ayse","Mehmet","Kazım","Colin"};
        boolean contain2 = ArraysUtility.contains(names,"Ayse");
        System.out.println("contain2 = " + contain2);








    }
}
