package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("tansu",  34, 'F', 5500);
        System.out.println(employee1);

        employee1.setAge(35);

        System.out.println(employee1);

        Employee employee2 = new Employee("Tarık", 2, 'M', 18000);

        System.out.println(employee2);

        employee2.setAge(16);

        System.out.println(employee2);

        employee2.setSalary(employee2.getSalary()+1500);
        System.out.println(employee2);





    }
}
