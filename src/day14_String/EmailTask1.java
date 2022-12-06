package day14_String;

public class EmailTask1 {
    public static void main(String[] args) {

        String email = "zubeyir_develioglu@gmail.com";

        String firstName = email.substring(0,email.indexOf("_"));

        System.out.println("firstName =" + "" + firstName.toUpperCase().charAt(0) + firstName.substring(1) );

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));

        lastName = "" + lastName.toUpperCase().charAt(0) + lastName.substring(1);

        System.out.println("lastName =" + lastName);

    }



}
