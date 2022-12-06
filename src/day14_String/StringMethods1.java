package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "           \"batch       2     5\"          ";
        str1 = str1.trim();

        System.out.println("str1 = " + str1);

        System.out.println("------------------------");

        String str2 = "Zubeyir Develi";
        int x1 = str2.indexOf('r');
        System.out.println("x1 = " + x1);

        int x2 = str2.indexOf('D');
        System.out.println("x2 = " + x2);

        int x3 =str2.indexOf('e');
        System.out.println("x3 = " + x3);//ilk e hangisi ise onun index numarasını verir

        int x4 = str2.indexOf("li");
        System.out.println("x4 = " + x4);

        int x5 = str2.indexOf('l');
        System.out.println("x5 = " + x5);

        int x6 = str2.indexOf("Develi");
        System.out.println("x6 = " + x6);

        int x7 = str2.lastIndexOf('D');
        System.out.println("x7 = " + x7);

        int x8 = str2.lastIndexOf('i');
        System.out.println("x8 = " + x8);



    }
}
