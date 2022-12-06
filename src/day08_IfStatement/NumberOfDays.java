package day08_IfStatement;

public class NumberOfDays {

    public static void main(String[] args) {

        int ay = 3;

        boolean has28Days = ay == 2;
        boolean has30Days = ay == 4||ay==6||ay==9||ay==11;
        boolean has31Days = ay == 1||ay==3||ay==5||ay==7||ay==8||ay==9||ay==10||ay==12; //!has28Days && !has30Days;


        if (has31Days) {
            System.out.println("31 days");
        }
        if (has30Days){
            System.out.println("30 days");
        }
        if (has28Days) {
            System.out.println("28 days");
        }
    }
}
