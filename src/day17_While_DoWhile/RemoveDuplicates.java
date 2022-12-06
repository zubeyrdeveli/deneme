package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str ="AAABBBCCCDEEDRR";

        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            String ch = ""+ str.charAt(i);
            if (result.contains(ch)){      //if the result contains the character
                continue;                  // skips that character
            }
            result+=ch;
        }

        System.out.println(result);

    }
}
