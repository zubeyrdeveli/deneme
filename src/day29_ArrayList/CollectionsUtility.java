package day29_ArrayList;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(35,20,50,20,22,30,20,33,8));

        System.out.println("list = " + list);

        Collections.sort(list);

        System.out.println("list = " + list);

        System.out.println("-----------------------------------");

        Collections.reverse(list);

        System.out.println("list = " + list);

        Collections.swap(list, 3, 4);

        System.out.println("list = " + list);

        System.out.println("--------------------------------");

        int max = Collections.max(list);

        System.out.println("max = " + max);

        int min = Collections.min(list);

        System.out.println("min = " + min);

        System.out.println("-----------------------------------");

        ArrayList <Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(35,20,50,20,22,30,20,33,8));

        Collections.replaceAll(list2, 20, 200);

        System.out.println("list2 = " + list2);

        System.out.println("-----------------------------------");

        int freq = Collections.frequency(list2,200);

        System.out.println("freq = " + freq);

        System.out.println("--------------------------------");

        ArrayList<String> words = new ArrayList<>();

        words.addAll(Arrays.asList("Ali","Veli", "Ahmet", "Ali", "Ayşe", "Zeki", "Ali","Ahmet", "Ali", "Ayşe", "Zeki"));

        int countAhmet = Collections.frequency(words,"Ahmet");

        System.out.println("countAhmet = " + countAhmet);

        int countAli = Collections.frequency(words,"Ali");

        System.out.println("countAli = " + countAli);

    }
}
