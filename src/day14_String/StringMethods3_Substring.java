package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {

        String word = "Cydeo School";

        String brand = word.substring(0,5);

        System.out.println("brand = " + brand);

        String str1 = word.substring(word.indexOf('S'));

        System.out.println("str1 = " + str1);

        System.out.println(word.substring(word.indexOf('C')));
        System.out.println("------------");

        String word2 = "Mehmet Emin Develi";

        String s1 = word2.substring(0,word2.indexOf(" "));
        System.out.println("s1 = " + s1);

        String s2 = word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        System.out.println("s2 = " + s2);

        String s3 = word2.substring(word2.lastIndexOf(" ")+1); //,(word2.lastIndexOf(""))
        System.out.println("s3 = " + s3);
        System.out.println("--------------");

        String email = "cydeo.school@gmail.com";

        String domain1 = email.substring(email.indexOf("@")+1,email.indexOf(".com"));

        System.out.println("domain1 = " + domain1);





    }
}
