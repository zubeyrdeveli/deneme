package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(4,7,8,5,6,9,7,4,3,1,5));

        System.out.println("numbers = " + numbers);

        Collections.swap(numbers, 0, numbers.size()-1);

        System.out.println("numbers = " + numbers);

        System.out.println("---------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0,1,2,0,7,8,0,9,3,0));

        System.out.println("list = " + list);

        int size = list.size();
        System.out.println("size = " + size);

        list.removeAll(Arrays.asList(0));
        System.out.println("list = " + list);
        int newSize = list.size();
        System.out.println("newSize = " + newSize);

        int numberOfRemoved0s= size-newSize; //total number of zeros
        System.out.println("numberOfRemoved0s = " + numberOfRemoved0s);

        for (int i = 0; i < numberOfRemoved0s; i++) {
            list.add(0);
        }
        System.out.println("list = " + list);

        System.out.println("--------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(0,1,2,0,7,8,0,9,3,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each!=0) {
                result.add(each);
            }
        }
        System.out.println("result = " + result);

        for (Integer each : list2) {
            if (each==0){
                result.add(each);
            }
        }
        System.out.println("result = " + result);

        System.out.println("--------------------------------------------------------");

        String str = "AK14?LGD38769*@*$$½+&LFN!35L7";
        System.out.println("str = " + str);
        System.out.println("------------------------------------");

        ArrayList<Character> allChars = new ArrayList<>();  //convert the String to "Character ArrayList" version
        for (int i = 0; i < str.length(); i++) {
            allChars.add(str.charAt(i));
        }
        System.out.println("All chars = " + allChars);

        ArrayList<Character> letters = new ArrayList<>(allChars); // add all the characters into an ArrayList
        letters.removeIf(p-> !Character.isLetter(p)); // remove the characters that are NOT letters
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(allChars); // add all the characters into the ArrayList
        digits.removeIf(p-> !Character.isDigit(p)); // remove the characters that are NOT digits
        System.out.println("digits = " + digits);

        ArrayList<Character> specialChars = new ArrayList<>(allChars); // add all the characters into the ArrayList
        specialChars.removeIf(p-> Character.isLetterOrDigit(p)); // remove the characters that are NOT special characters
        System.out.println("specialChars = " + specialChars);

        ArrayList<Character> result1 = new ArrayList<>();

        for (Character each : letters) {  //add all letters to a new ArrayList
            result1.add(each);      //[A, K, L, G, D, L, F, N, L]
        }
        for (Character each : digits) {   //add all digits to the new ArrayList
            result1.add(each);     //[A, K, L, G, D, L, F, N, L, 1, 4, 3, 8, 7, 6, 9, 3, 5, 7]
        }
        for (Character each : specialChars) {   //add all special characters to the new ArrayList
            result1.add(each); //[A, K, L, G, D, L, F, N, L, 1, 4, 3, 8, 7, 6, 9, 3, 5, 7,?, *, @, *, $, $, ½, +, &, !]
        }

        System.out.println("result1 = " + result1);
        System.out.println("------------------------------------");

        String latestVersion = "";

        for (Character each : result1) {    //convert the latest version to String again
            latestVersion += each;
        }
        System.out.println("latestVersion = " + latestVersion);

    }
}
