package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(34);
        numbers.add(33);
        numbers.add(23);
        numbers.add(50);

        numbers.add(2,45);
        numbers.add(4,55);
        numbers.add(6,66);

        System.out.println(numbers);

        System.out.println("size = "+ numbers.size());

        int lastIndexNumber = numbers.size() -1;

        System.out.println("lastIndexNumber = " + lastIndexNumber);

        int fourthIndex = numbers.get(4);

        System.out.println("fourthIndex = " + fourthIndex);

        System.out.println("----------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("----------------------------------");

        ArrayList <String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Ahmet");
        names.add("Veli");
        names.add("Zekeriya");

        System.out.println("names = " + names);

        String newName = names.get(2);

        System.out.println("newNames = " + newName);

        System.out.println("---------------------------------");

        ArrayList <String> students = new ArrayList<>();

        students.add("Ali");
        students.add("Ahmet");
        students.add("Veli");
        students.add("Zekeriya");


        System.out.println("students = " + students);

        students.set(2,"Sezai");

        System.out.println("students = " + students);

        students.set(0,"Cemil");

        System.out.println("students = " + students);

        System.out.println("----------------------------------");

        ArrayList <String> employees = new ArrayList<>();

        employees.add("Mehmet");
        employees.add("Zachary");
        employees.add("Zeki");
        employees.add("Üzeyir");
        employees.add("Bekir");
        employees.add("Muhtar");
        employees.add("Asiya");

        System.out.println("employees = " + employees);

        employees.remove(2);

        System.out.println("employees = " + employees);

        employees.remove("Bekir");

        System.out.println("employees = " + employees);

        employees.remove(employees.size()-1);
        System.out.println("employees = " + employees);

        boolean deneme = employees.remove("Ali");

        System.out.println(deneme);


    }
}
