package day25_CustomMethod_Oberloading;

public class SumOfNumbers {

    public static void main(String[] args) {


        int sum=sumOf2numbers(25,45);

        System.out.println(sum);

        int sum3 = sumOf3numbers(25,45,55);

        System.out.println(sum3);

        int sum4 = sumOf4numbers(25,45,55,65);
        System.out.println(sum4);

    }

    public static int sumOf2numbers (int num1, int num2) {
        return num1+num2;
    }
    public static int sumOf3numbers (int num1, int num2, int num3) {
    return num1+num2+num3;
    }

    public static int sumOf4numbers (int num1, int num2, int num3, int num4) {
        return num1+num2+num3+num4;
    }



}
