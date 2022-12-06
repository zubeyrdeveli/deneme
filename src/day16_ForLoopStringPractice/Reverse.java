package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String word = "I love Java. Java is a good programming language";
        String result= "";

        for (int i = word.length()-1; i >= 0 ; i--) {

            result += word.charAt(i);

        }
        System.out.println("result = " + result);



    }
}
