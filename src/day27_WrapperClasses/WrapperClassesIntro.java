package day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1; //auto boxing

        int num2 = n1; // unboxing

        System.out.println("----------------------");

        Integer integerValue = 100;

        long deneme = integerValue;

        System.out.println("-------------------------------------------------");

        Byte b1 = 25;

        byte b2 = b1;
        short s2 = b1;
        int i2 = b1;
        long l2 =b1;

        System.out.println("----------------------------------------------------");

        int [] numbers = {1,2,3,4};

        Integer [] numbers2 = {1,2,3,4,5,6};

        System.out.println("--------------------------");



    }
}
