package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate:");

        double hourlyRate = input.nextDouble();

        System.out.println("How many hours do you work in a week?");

        int hours = input.nextInt();

        System.out.println("Enter the state tax:");

        double stateTax = input.nextDouble();

        System.out.println("Enter the federal tax:");

        double federalTax = input.nextDouble();


        double weeklySalary = hours*hourlyRate;

        double totalTaxWeekly = (stateTax+federalTax) * weeklySalary;

        double totalTaxYearly = totalTaxWeekly*52;

        double netWeeklyIncome = weeklySalary - totalTaxWeekly;

        double netYearlyIncome = netWeeklyIncome*52;

        System.out.println("weeklySalary = " + weeklySalary);
        System.out.println("stateTax = " + stateTax*weeklySalary);
        System.out.println("federalTax = " + federalTax*weeklySalary);
        System.out.println("totalTaxWeekly = " + totalTaxWeekly);
        System.out.println("totalTaxYearly = " + totalTaxYearly);
        System.out.println("netWeeklyIncome = " + netWeeklyIncome);
        System.out.println("netYearlyIncome = " + netYearlyIncome);

    }
}
