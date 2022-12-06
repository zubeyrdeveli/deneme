package day07_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        String name= "Zachary";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >=18 && citizen == "USA";

        String isim = "Zubeyr Develi";
        int kredipuan = 800;
        int yas = 34;
        int gelir = 2500;
        char cinsiyet = 'E';

        boolean kredialabilir = kredipuan >= 700 && yas >= 18 && gelir >= 5500 && cinsiyet == 'K' ;


        System.out.println();
        System.out.println("Sayın " + isim + " kredi alabilir = " + kredialabilir);

        System.out.println("-----------------------------------");

        System.out.println(name + " is eligible to vote= " + isEligible);






    }
}
