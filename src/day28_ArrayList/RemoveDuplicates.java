package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

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

        ArrayList <String> result = new ArrayList<>();

        for (String each : list) {
            if (result.contains(each)) {
                continue;
            }
            result.add(each);
        }

        System.out.println("result = " + result);


    }
}
