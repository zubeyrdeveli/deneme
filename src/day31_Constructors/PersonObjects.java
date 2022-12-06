package day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Zubeyr", 'M', 34);
        System.out.println("person1 = " + person1);

        Person person2 = new Person("Tarık", 'M', 2);
        person2.name = "Zumra";
        person2.gender='F';
        System.out.println("person2 = " + person2);



    }
}
