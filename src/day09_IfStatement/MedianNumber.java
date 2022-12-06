package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 20, b = 30, c = 40;

        boolean aismed = b>a && a>c || c>a && a>b;
        boolean bismed = a>b && b>c || c>b && b>a;
        boolean cismed = !aismed&&!bismed; //a>c && c>b || b>c && c>a;

        if (aismed) {
            System.out.println("a is the median number");
        }
        if (bismed) {
            System.out.println("b is the median number");
        }
        if (cismed) {
            System.out.println("c is the median number");
        }


/*
        if (b>a>c){
            System.out.println("a is the median number");
        }
        if (a>b>c){
            System.out.println("b is the median number");
        }
        if (a>c>b){
            System.out.println("c is the median number");
        }

 */

    }
}
