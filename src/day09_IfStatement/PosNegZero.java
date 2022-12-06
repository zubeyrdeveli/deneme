package day09_IfStatement;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 0;

        /*
        boolean pos = n>0;
        boolean neg = n<0;
        */

        if ( n > 0 ) {
        System.out.println( n + " is positive");
        }
        else if ( n < 0 ){
        System.out.println( n + " is negative");
        } else {System.out.println( n + " is zero");}

    }

}
