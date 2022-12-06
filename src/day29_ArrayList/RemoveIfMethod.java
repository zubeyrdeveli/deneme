package day29_ArrayList;

import Utilities.ArraysUtility;
import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("list = " + list);

        list.removeIf(p-> p%2==0);

        System.out.println("list = " + list);


        /*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.removeAll(Arrays.asList(i));
            }
        }

         */

        System.out.println("------------------");

        ArrayList <String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList("Ahmet", "Mehmet", "Asım", "Sezai", "Zeki", "Patlıcan"));

        System.out.println("list3 = " + list3);

        list3.removeIf(p-> p.startsWith("A"));

       // list3.removeIf(p-> p.contains("A") || p.contains("a"));

        System.out.println("list3 = " + list3);

        System.out.println("------------------------------");

        ArrayList <String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna", "Cafer" , "Zeki" , "Racecar", "Civic"));

        System.out.println("names = " + names);

        names.removeIf( p-> !StringUtility.isPalindrome(p));

        System.out.println("names = " + names);









    }
}
