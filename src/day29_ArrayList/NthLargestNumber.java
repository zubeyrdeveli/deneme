package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,3,5,7,9,6,5,4,9,2,7,1));

        System.out.println("list = " + list);

        int maxNumber = Collections.max(list);

        System.out.println("maxNumber = " + maxNumber);

      //  list.removeIf(p-> Collections.max(list) == p );

      //  int secondMax = Collections.max(list);

       // System.out.println("secondMax = " + secondMax);

        int n = 2;

        for (int i = 1; i < n; i++) {
            list.removeIf(p-> Collections.max(list) == p );
        }

        int nthMaxNumber = Collections.max(list);

        System.out.println("nthMaxNumber = " + nthMaxNumber);

    }
}
