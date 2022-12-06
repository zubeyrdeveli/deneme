package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo   1234500000  School!!@%&^3#wooden    Spoon";

        String digits ="";
        String letters ="";
        String specialChars="";

        for (int i = 0; i < str.length(); i++) {  //i:index numbers of str (0~last index)

            char ch = str.charAt(i);  //ch:every character that we have in str

            if (ch >= '0' && ch<= '9' ){  // if the character is between '0' and '9' then it's digit
                digits += ch;

            } else if (ch >= 'a' && ch<= 'z' || ch>= 'A' && ch<='Z') { //if the character is between 'a' and 'z' or 'A' and 'Z' then it's letter
                letters += ch;

            }else {          // if the character is neither digit nor letter, then it's special character
                if (ch != ' ') // if the special character is not a space
                {
                    specialChars += ch;

                }

            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
