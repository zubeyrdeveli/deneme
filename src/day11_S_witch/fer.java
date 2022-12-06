package day11_S_witch;

public class fer {
    public static void main(String[] args) {

        int num = 2;
        boolean b = true;

        switch (num) {

            case 0:
                b = false;
            case 1:
                System.out.print(1);
            case 2:
                if (b) {
                    System.out.println(2);
                } else {
                    b = false;
                }
            case 3:
                if (b) {
                    System.out.println(3);
                    b = false;
                } else {
                    break;
                }
            case 4:
                System.out.println(4);
            case 5:
                if (!b) {
                    break;
                }
                System.out.println(5);
        }
    }
}

