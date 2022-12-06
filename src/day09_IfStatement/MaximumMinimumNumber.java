package day09_IfStatement;

public class MaximumMinimumNumber {
    public static void main(String[] args) {

        int n1 = 1300;
        int n2 = 200;
        String maxNumber = " is the maximum number";
        String minNumber = " is the minimum number";

        if (n1>n2){
            System.out.println(n1 + maxNumber);
        } else {
            System.out.println(n2 + maxNumber);
        }

        if (n1<n2) {
            System.out.println(n1 + minNumber);
        } else {
            System.out.println(n2 + minNumber);
        }
    }

}
