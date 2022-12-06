package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Ahmet", 'M', 27, 61, 'A');

        System.out.println("student1 = " + student1);

        Student student2 = new Student();
        student2.setInfo("Merve", 'F', 24, 58, 'D');

        Student student3 = new Student();
        student3.setInfo("Barış", 'M', 37, 38, 'B');

        Student student4 = new Student();
        student4.setInfo("Ayten", 'F', 42, 47, 'A');

        Student student5 = new Student();
        student5.setInfo("Suzan", 'F', 33, 101, 'C');


        Student[] students= {student1,student2,student3,student4,student5};
        for (Student each : students) {
            System.out.println(each);
        }

        System.out.println("----------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // gradeA
        ArrayList<Student> angryBirds = new ArrayList<>();

        earlyBirds.addAll(Arrays.asList(students));
        earlyBirds.removeIf(p-> p.grade!='A');
        System.out.println("earlyBirds = " + earlyBirds);

        angryBirds.addAll(Arrays.asList(students));
        angryBirds.removeAll(earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println("number of early Birds = " + earlyBirds.size());
        System.out.println("number of Angry Birds = " + angryBirds.size());
        /*
        for (Student each : students) {
            if (each.grade == 'A') {
                earlyBirds.add(each);
            } else {
                angryBirds.add(each);
            }
        }

         */



    }
}
