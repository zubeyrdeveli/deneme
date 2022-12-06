package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String [] names = {"Elif Celik", "Ahmet Yilmaz", "Mehmet Yigit", "Zeki Olgu", "Ülkü Yeter", "Ceylan Sırkıntı",
                "Sevgi Dere", "Daniel Guiza"};

        for (String each : names) {

            String reversed = "";

            for (int i = each.length()-1; i >= 0 ; i--) {
                reversed+=each.charAt(i);
            }
            System.out.println("reversed = " + reversed);

        }







    }
}
