package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7", 1000, "black");
        Samsung samsung = new Samsung("galaxy s19", "6", 900, "gray");
        Nokia nokia = new Nokia("Brick", "4", 50, "White" );

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(656565656);
        iphone.text(1363463434);
        iphone.faceTime(553535353);

        System.out.println("-----------------------------------------------");

        samsung.call(124342424);
        samsung.text(132424242);
        samsung.freeze();

        System.out.println("------------------------------------------------------");

        nokia.text(122434535);
        nokia.call(133535);
        nokia.selfDefence();

        System.out.println("--------------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(samsung.hasBattery);
        System.out.println(iphone.hasBattery);
        System.out.println(nokia.hasBattery);



    }



}
