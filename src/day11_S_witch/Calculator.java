package day11_S_witch;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 10,
                n2 = 5;

        char operator = 't';

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if (valid) {

            switch (operator) {

                case '+':
                    System.out.println(n1+n2);
                    break;

                case '-':
                    System.out.println(n1-n2);
                    break;

                case '*':
                    System.out.println(n1*n2);
                    break;

                default:
                    System.out.println(n1/n2);



            }





        }else {
            System.err.println("invalid operator: "+operator);
        }



    }
}
