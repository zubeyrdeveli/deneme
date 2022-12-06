package Utilities;

import java.util.Arrays;

public class StringUtility {

    // prints each character of the given string
    public static void printEachChar (String str) {

        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));
        }

    }
    // reverses the given string and returns the reversed string
    public static String reverse (String str) {

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {

            result += str.charAt(i);

        }

        return result;

    }

    //checks if the given String is palindrome or not, returns boolean (true or false)
    public static boolean isPalindrome (String str) {

        return reverse(str).equalsIgnoreCase(str);
    }

    //checks if the given string is anagram or not, and returns boolean (true or false)
    public static boolean isAnagram (String str1, String str2) {

        char [] ch1= str1.toCharArray();
        char [] ch2= str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);




    }

    //removes the dublicated characters from the given string, returns the dublicated string
    public static String removeDublicates (String str) {

        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains(""+each)) {
                result+=each;
            }
        }

        return result;
    }



}


