package day24_CustomMethods_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        String str = "Java";

        String reverse = reverse(str);

    }

    public static String reverse (String str) {
        String reverse ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("result = " + reverse);

        return reverse;
    }


}
