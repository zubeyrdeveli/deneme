package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aavldmvkncjnsdsdsmvdkbn";



        ArrayList<String> list =new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println("list = " + list);

        ArrayList<String> uniqueChars = new ArrayList<>(list);

        uniqueChars.removeIf(p-> Collections.frequency(list,p) > 1 );

        System.out.println("uniqueChars = " + uniqueChars);

        System.out.println("---------------------------");

        String unique = "";

        for (String each : list) {
            int freq = Collections.frequency(list,each);
            if (freq==1) {
                unique += each;
            }
        }
        System.out.println("unique = " + unique);








    }




}
