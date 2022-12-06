package day31_Constructors;

public class ZiraatBank {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Zubeyr Develi", 245353424,23500);

        System.out.println("account1 = " + account1);

        account1.deposit(2000);
        System.out.println("account1 = " + account1);

        account1.withdraw(9000);
        System.out.println("account1 = " + account1);

        account1.withdraw(7000);
        account1.checkBalance();

        System.out.println("-------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Zumra", 245353423 , 3000);

        account2.checkBalance();





    }
}
