package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str);

        System.out.println(num+1);
        System.out.println(str+1);

        String str2 = "3.5";

        double num2= Double.parseDouble(str2);

        System.out.println(num2 + 1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 =Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1 ="true";
        boolean r1= Boolean.parseBoolean(s1);

        System.out.println("r1 = " + r1);

        System.out.println("----------------------------------");

        String s2 = "123";

        Integer x = Integer.valueOf(s2);

        int y = Integer.valueOf(s2);

        System.out.println(x);
        System.out.println(y);

        System.out.println("----------------------------");

        char ch1 = '8';
        char ch2 ='A';
        char ch3 ='*';
        char ch4= 'a';

        boolean r2 = Character.isDigit(ch1);
        boolean r3 = Character.isLetter(ch2);
        //isSpecialChar?
        boolean r4 = !Character.isLetterOrDigit(ch3);
        boolean r5 = Character.isUpperCase(ch4);
        boolean r6 = Character.isUpperCase(ch2);
        boolean r7 = Character.isLowerCase(ch4);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);

        System.out.println("---------------------------------");

        String s = "ab2cvjkdjgjn8djh3idjby";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if ( Character.isDigit(each) ) {
                sum += Integer.parseInt(""+each);
            }
        }

        System.out.println("sum = " + sum);
    }
}
