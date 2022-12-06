package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Zubeyr";
        String lastName = "Develi";
        int age = 34;
        String jobTitle = "Software Tester";
        String companyName = "Apple Inc";
        double salary = 857500.58;


        String fullName = firstName +" "+ lastName;

        System.out.println("Full name of the person is " + fullName+".\n"+fullName+" is " + age + " years old.");

        System.out.println(fullName + " is " + jobTitle +"," + "\nworks at " + companyName + ", and\n" + fullName + "'s salary is $"+ salary );

    }
}
