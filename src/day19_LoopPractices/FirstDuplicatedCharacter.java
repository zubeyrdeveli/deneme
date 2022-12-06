package day19_LoopPractices;

public class FirstDuplicatedCharacter {

    public static void main(String[] args) {
        String str = "fevzzzziiiii";
        String result = ""; //a2b1c3d1

        String temp = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // each character from string

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i); // each character of str

                if (ch == each && i != j) {
                    temp += "" + ch + ch;
                    System.out.println(temp);
                    System.exit(0);
                }
            }
        }
    }
}