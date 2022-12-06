package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int n = 6; //1 ~ 7

        if (n == 1) {
            System.out.println("Monday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else if (n== 7){
            System.out.println("Sunday");
        } else {
            System.out.println("invalid data");
        }

        System.out.println("------------------------");

        System.out.println ( (n==1)? "Pazartesi":(n==2)? "Salı":(n==3)? "Çarşamba":(n==4)? "Perşembe"
                :(n==5)? "Cuma" : (n==6)? "Cumartesi" : (n==7)? "Pazar" : "geçersiz bilgi");



    }
}
