package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();

        list.add("Ayşe");
        list.add("Biber");
        list.add("Fatma");
        list.add("Patlıcan");
        list.add("Hayriye");
        list.add("Patlıcan");
        list.add("Domates");
        list.add("Ayşe");
        list.add("Biber");

        System.out.println("list = " + list);

        ArrayList <String> unique = new ArrayList<>();

        for (String each : list) {
            if (list.indexOf(each)==list.lastIndexOf(each)) {
                 unique.add(each) ;
            }
        }

        System.out.println("unique = " + unique);







    }
}
