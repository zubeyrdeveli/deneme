package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        String [] countries = {"Turkey" , "Canada" , "United Kingdom" , "Tanzania" , "Switzerland", "United States"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        System.out.println("list = " + list);

        list.removeIf(p-> p.length()>=10);

        System.out.println("list = " + list);

        countries= list.toArray(new String[1]);

        System.out.println("countries = " + Arrays.toString(countries));






    }





}
