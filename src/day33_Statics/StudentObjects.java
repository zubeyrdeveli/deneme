package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ali");
        Student student2 = new Student("Deniz", 23,'B');
        Student student3 = new Student("Remzi", 'M', 34);
        Student student4 = new Student("Suzan", 'F', 31, 444, 'A');
        Student student5 = new Student("Cihad", 'M', 27, 344);
        Student student6 = new Student("Zumra", 'F', 5, 38, 'A' );


        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("student4 = " + student4);
        System.out.println("student5 = " + student5);
        System.out.println("student6 = " + student6);

        Student [] students = {student1,student2,student3,student4,student5,student6};

        System.out.println("students = " + Arrays.toString(students));

    }
}
