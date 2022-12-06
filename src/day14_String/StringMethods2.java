package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str1 = "Java is fun, I love learning Java";
        str1 = str1.replace("Java","Pyhton");

        System.out.println("str1 = " + str1);
        String email= "zubeyir_3861@yahoo.com";
        email = email.replace("yahoo","hotmail");
        System.out.println("email = " + email);
        System.out.println("--------------------");
        String str2 = "Dog, Dog, Dog, Dog, Dog, Dog, Dog, Dog, Dog";
        System.out.println("str2 = " + str2);
        str2 = str2.replace("Dog","Cat");
        System.out.println("str2 = " + str2);

        String str3 = "Java Java Java";
        str3= str3.replaceFirst("Java","Phyton");
        System.out.println("str3 = " + str3);




    }
}
