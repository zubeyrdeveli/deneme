package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {



        /*if(s>= 0 && s <= 100){

            if (s >= 60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }


        }else{

            System.out.println("Invalid score");

        }

         */

        System.out.println("-----------------------------------");


/*
        String sonuc = (s >= 0) && s <= 100)? (s >= 60)? "Geçti" : "Kaldı" : "geçersiz";

        System.out.println("sonuc = " + sonuc);

 */
        int s = 70;

        /*
        if(s >= 0 && s <= 100){
            if(s >= 60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Score");
        }
        */

        String result = (s >= 0 && s <= 100)? (s >= 60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result);

        String sonuc = (s >= 0 && s <= 100)? (s >= 60)? "Geçtin" : "Kaldın" : "geçersiz";

        System.out.println(sonuc);



    }
}
