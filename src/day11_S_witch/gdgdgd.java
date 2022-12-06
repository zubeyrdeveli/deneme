package day11_S_witch;

import java.util.Scanner;

public class gdgdgd {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        byte b1 = x.nextByte();
        byte b2 = x.nextByte();

        int max = (b1>b2) ? b1 + 2 : b2 - 4;

        System.out.println("max = " + max);
    }
}
