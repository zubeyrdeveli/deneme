package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {

        String word= "Level";
        String reversed = "";

        for (int i = word.length()-1; i >= 0 ; i--) {

            reversed += word.charAt(i);
        }
        if (reversed.equalsIgnoreCase(word)){
            System.out.println("word is palindrome");
        } else {
            System.out.println("not palindrome");
        }



    }
}
