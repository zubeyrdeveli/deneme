package day30_CustomClass;

import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Sezen", 34,'F', "Cook", 5600, true);

        Employee employee2 = new Employee();
        employee2.setInfo("John", 38,'M', "Driver", 5800, false);

        Employee employee3 = new Employee();
        employee3.setInfo("Elon", 44,'M', "Engineer", 6600, true);

        Employee employee4 = new Employee();
        employee4.setInfo("Hilary", 23,'F', "Teacher", 8500, false);

        Employee employee5 = new Employee();
        employee5.setInfo("Zach", 54,'M', "Gardener", 5500, true);

        Employee [] employees = {employee1,employee2,employee3,employee4,employee5};
        System.out.println("employees = " + Arrays.toString(employees));

        int fullTimeEmployees = 0;
        int partTimeEmployees = 0;
        for (Employee each:employees){
            if (each.isFullTime){
                fullTimeEmployees++;
            } else {
                partTimeEmployees++;
            }
        }

        System.out.println("fullTimeEmployees = " + fullTimeEmployees);
        System.out.println("partTimeEmployees = " + partTimeEmployees);

        double minSalary = employee1.salary;

        for (Employee each:employees) {
            if (each.salary<minSalary)
                minSalary=each.salary;
        }

        System.out.println("minSalary = " + minSalary);

        double maxSalary = employees[0].salary;

        for (Employee each : employees){
            if (each.salary>maxSalary){
                maxSalary=each.salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);

    }
}
