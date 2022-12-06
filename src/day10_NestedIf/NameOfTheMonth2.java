package day10_NestedIf;

public class NameOfTheMonth2 {

    public static void main(String[] args) {
        int ay = 13;

        String month= "";

        month= (ay==1)?"Ocak":(ay==2)?"Şubat":(ay==3)? "Mart":(ay==4)? "Nisan":(ay==5)? "Mayıs":(ay==6)? "Haziran"
                :(ay==7)? "Temmuz":(ay==8)? "Ağustos":(ay==9)? "Eylül":(ay==10)? "Ekim":(ay==11)? "Kasım":(ay==12)? "Aralık":"geçersiz bilgi";

        System.out.println(month);
    }
}
