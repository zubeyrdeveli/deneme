package day09_IfStatement;

public class MinNumber {
    public static void main(String[] args) {

        int n1= 400, n2= 400;

      /*  boolean isNum1Min = n1>n2;
        boolean isNum2Min = n1<n2;
        boolean isEqual = n1==n2;

       */

        if (n1<n2) {
            System.out.println(n1 + " is the min number");
        }
        if (n1>n2){
            System.out.println(n2 + " is the min number");
        }
        if (n1==n2) {
            System.out.println("equal");
        }


    }



}
