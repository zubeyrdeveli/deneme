package day32_Constructor;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", "Accord");
        Car car3 = new Car("Mercedes", "C180", 2021 );
        Car car4 = new Car("Peugeout", "301", 2018, 350000);
        Car car5 = new Car("BMW", "320D", 2019, 650000, "Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }
}
