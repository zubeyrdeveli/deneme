package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {


        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,3,4,2,3,4,4));

        System.out.println("list = " + list);

        list.removeAll(Arrays.asList(2,3,4));

        System.out.println("list = " + list);

        System.out.println("----------------------------------");

        ArrayList <Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,3,4,2,3,4,4));

        System.out.println("list2 = " + list2);

        list2.retainAll(Arrays.asList(2,3,4));

        System.out.println("list2 = " + list2);

        System.out.println("--------------------------------------");

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,10,6,7,3,4,2,3,4,4,4,5,6,7));

        System.out.println("numbers = " + numbers);

        boolean ten = numbers.contains(10);

        System.out.println("ten = " + ten);

        boolean oneTwoThree = numbers.containsAll(Arrays.asList(1,2,3));

        System.out.println("oneTwoThree = " + oneTwoThree);

        boolean oneTwoThreeEight = numbers.containsAll(Arrays.asList(1,2,3,8));

        System.out.println("oneTwoThreeEight = " + oneTwoThreeEight);

        System.out.println("---------------------------------------");

        String [] names = {"Ali", "Veli", "Ahmet", "Mehmet", "Deniz"};

        System.out.println("names = " + Arrays.toString(names));

        ArrayList <String> nameList = new ArrayList<>(Arrays.asList(names));

        //nameList.addAll(Arrays.asList(names));

        System.out.println("nameList = " + nameList);

        System.out.println("-------------------------------------------");

        Integer [] arr = {1,2,3,4,5,6,7,8};

        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(arr));

        System.out.println("nums = " + nums);

        System.out.println("---------------------------------");

        int [] arr2 = {1,2,3,4,5,6,7,8,9};

        ArrayList <Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list3 = " + list3);

    }

    public static ArrayList <Integer> convertArrayToArrayList (int[] array) {

        ArrayList <Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);

        }
        return list;

    }
}
