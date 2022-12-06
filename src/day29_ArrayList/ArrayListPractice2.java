package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali", "Veli", "Ahmet", "Mehmet", "Deniz", "David","Shay"));

        employees.retainAll(Arrays.asList("Ahmet", "David"));

        System.out.println("employees = " + employees);

        System.out.println("---------------------------------------");

        String [] names = {"Ali", "Veli", "Ahmet", "Mehmet", "Deniz", "David","Aslı"};

        System.out.println("names = " + Arrays.toString(names));

        ArrayList<String> students = new ArrayList<>(Arrays.asList(names));

        students.removeIf(p-> p.charAt(0)=='A');

        System.out.println("students = " + students);

        names = students.toArray(new String[1]);

        System.out.println("names = " + Arrays.toString(names));









    }
}
