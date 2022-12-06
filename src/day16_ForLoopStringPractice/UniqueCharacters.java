package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdddefffghhhhh";
        String result ="";

        for (int i = 0; i < str.length(); i++) {      // i: index number of str (starting from 0)
            char ch = str.charAt(i); // each characters of str
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result += ch;
            }

        }
        System.out.println("result = " + result);


    }
}
