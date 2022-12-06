package day25_CustomMethod_Oberloading;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        int [] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double [] doubleArray = {11.5, 2.9, 7.5, 3.5};
        Arrays.sort(doubleArray);

        char [] charArray = {'A', 'Z', 'F', 'K', 'y'};
        Arrays.sort(charArray);

        System.out.println("---------------------------------------------------");

        int sum1= sumOfnumbers(10,20);
        int sum2= sumOfnumbers(10,20,30);
        double sum3= sumOfnumbers(5.1,4.8);
        double sum4= sumOfnumbers(1.2,7.2,4.5);
        double sum5= sumOfnumbers(4,5,7,8);
        double sum6= sumOfnumbers(4.1,3.2,1.9,2.5);

    }

    public static int sumOfnumbers (int num1, int num2) {
        return num1+num2;
    }
    public static double sumOfnumbers (double num1, double num2) {return  num1+num2;}
    public static int sumOfnumbers (int num1, int num2, int num3) {
        return num1+num2+num3;
    }
    public static double sumOfnumbers (double num1, double num2, double num3) {return  num1+num2+num3;}
    public static int sumOfnumbers (int num1, int num2, int num3, int num4) {
        return num1+num2+num3+num4;
    }
    public static double sumOfnumbers (double num1, double num2, double num3,double num4) {return  num1+num2+num3+num4;}

}
