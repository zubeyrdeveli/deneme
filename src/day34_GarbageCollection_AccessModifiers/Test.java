package day34_GarbageCollection_AccessModifiers;

import static Utilities.MathUtility.*;

public class Test {
    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("----------------------------");

        double sumof = sum(10,20);
        System.out.println("sumof = " + sumof);

        int r3 = subtract(400,70);
        System.out.println("r3 = " + r3);




    }
}
