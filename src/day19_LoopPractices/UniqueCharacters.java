package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {


        String str = "aaabbbbcdddeffffghhhhh";
        String result = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);

                if (ch == each) {
                    count++;
                }

            }
            if (count == 1) { // if the frequency of the character is 1, then the character is unique

               result += ch;
            }
        }

        System.out.println("result = " + result);
    }
}