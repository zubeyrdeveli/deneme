package day24_CustomMethods_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {

    //String deneme = removeDuplicates("jhkjgkhkhkvvvbbkj");

       // System.out.println("deneme = " + deneme);

        String deneme = "dgnalgjlajdahdnjlkandgj";

        deneme= removeDuplicates(deneme);

        System.out.println("deneme = " + deneme);

        System.out.println("---------------------------");




    }

    public static String removeDuplicates (String str) {

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            char each = str.charAt(i);

            if (!result.contains(""+each)) {
            result+=each;

            }

        }

        return result;
    }


}
