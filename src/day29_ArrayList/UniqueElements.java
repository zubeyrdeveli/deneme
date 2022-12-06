package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(1, 9, 5, 4, 5, 6, 7, 4, 2, 1, 3, 1, 2, 7, 8));

        ArrayList<Integer> uniqueElements = new ArrayList<>();

        for (Integer each : list1) {
            int frequencyOfEach = Collections.frequency(list1, each);

            if (frequencyOfEach == 1) {
                uniqueElements.add(each);
            }
        }
        System.out.println("uniqueElements = " + uniqueElements);

        System.out.println("-------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 9, 5, 4, 5, 6, 7, 4, 2, 1, 3, 1, 2, 7, 8));

        System.out.println("list2 = " + list2);

        ArrayList<Integer> uniqueElements2 = new ArrayList<>(list2);

        uniqueElements2.removeIf(p-> Collections.frequency(list2,p) > 1 );

        System.out.println("uniqueElements2 = " + uniqueElements2);







    }
}