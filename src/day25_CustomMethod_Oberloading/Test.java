package day25_CustomMethod_Oberloading;

import Utilities.StringUtility;

public class Test {

    public static void main(String[] args) {


        String str ="Java Programming";

        StringUtility.printEachChar(str);

        String ad = "Zubeyr";

        StringUtility.printEachChar(ad);

        System.out.println("---------------------------");

        String s1 ="Wooden Slipper";
        String reverse=StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("-----------------------------------");

        String word = "halil";
        boolean isPalindrome = StringUtility.isPalindrome(word);

        System.out.println(word + " is palindrome: " + isPalindrome);

        System.out.println("-----------------------------------");

        String [] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String eachName : names) {
            if (StringUtility.isPalindrome(eachName)) {
                count++;
            }

        }

        System.out.println(count);

        System.out.println("-------------------------------------------");


        String name1= "halil";
        String name2= "hilal";

        boolean isAnagram = StringUtility.isAnagram(name1,name2);

        System.out.println("isAnagram = " + isAnagram);

        System.out.println("----------------------------------");

        String str3 = "aaaaaabaaaaccccbbbbaa";

        String removeDublicates = StringUtility.removeDublicates(str3);

        System.out.println(removeDublicates);


    }




}
