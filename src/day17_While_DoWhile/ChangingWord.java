package day17_While_DoWhile;

public class ChangingWord {
    /*
    -- Task 2:  Write a program that replaces every occurrence of "cat" in the message with "dog", using indexOf and substring.
  input:
  String message = "I love cats! I have a cat named Coco. My cat's very smart!";
  output:
 "I love dogs! I have a dog named Coco. My dog's very smart!";
     */

    public static void main(String[] args) {
        // 7   10
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        String searched = "cat";
        String changed = "dog";

        int indexOfCats = message.indexOf(searched);
        int endOfWord =indexOfCats+searched.length();

        message=message.substring(0,indexOfCats)+changed+message.substring(endOfWord);


        while (message.contains(searched)){

            indexOfCats = message.indexOf(searched);
            endOfWord =indexOfCats+searched.length();
            message=message.substring(0,indexOfCats)+changed+message.substring(endOfWord);


        }

        System.out.println("message = " + message);



    }
}