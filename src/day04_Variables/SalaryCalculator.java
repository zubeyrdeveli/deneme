package day04_Variables;

import javax.lang.model.SourceVersion;

public class SalaryCalculator {

    public static void main(String[] args) {
        //hourlyRate, weeklyHours

        int hourlyRates = 50;
        int weeklyHours = 40;

        int salary = hourlyRates * weeklyHours * 52;

        //System.out.println(salary);

        System.out.println("hourlyRates = $" + hourlyRates);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $" + salary);






    }




}
