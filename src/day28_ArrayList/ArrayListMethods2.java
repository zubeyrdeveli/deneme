package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);

        System.out.println("list = " + list);

        list.remove(1);

        System.out.println("list = " + list);

        Integer num = 600;
        boolean r1 = list.remove(num);

        System.out.println("list = " + list);
        System.out.println("r1 = " + r1);

        System.out.println("----------------------------");

        list.clear();

        System.out.println("list = " + list);

        System.out.println("---------------------------------");

        ArrayList <Character> chars = new ArrayList<>();

        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        chars.add('e');
        chars.add('f');
        chars.add('c');
        chars.add('d');

        System.out.println("chars = " + chars);
        int c1 = chars.indexOf('c');
        System.out.println("c1 = " + c1);
        int c2 = chars.lastIndexOf('c');
        System.out.println("c2 = " + c2);

        System.out.println("---------------------------");

        boolean checkChar = chars.contains('a');

        System.out.println("checkChar = " + checkChar);

        System.out.println("--------------------------");

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);
        list1.add(8);
        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(9);
        list2.add(8);

        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));

        System.out.println("-----------------------------------");

        boolean r4 = list1.isEmpty();
        System.out.println("r4 = " + r4);
        list1.clear();
        boolean r5 = list1.isEmpty();
        System.out.println("r5 = " + r5);

        System.out.println("--------------------------------------");

        ArrayList <Integer> test1 = new ArrayList<>();

        test1.addAll(Arrays.asList(2,3,4,5,6));

        System.out.println("test1 = " + test1);






    }
}
