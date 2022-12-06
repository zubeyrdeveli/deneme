package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Mercedes", "C180", "White", 2015, 20000);

        System.out.println("car1 = " + car1);

        Car car2 = new Car();
        car2.setInfo("Wolksvagen", "CC", "Metalic Gray", 2018, 25000);

        System.out.println("car2 = " + car2);

        Car car3 = new Car();
        car3.setInfo("BMW", "3.20D", "Black", 2020, 34000);

        System.out.println("car3 = " + car3);

        //Car [] cars = {car1,car2,car3};

        ArrayList<Car> cars = new ArrayList<>();

        cars.addAll(Arrays.asList(car1,car2,car3));

        System.out.println("cars = " + cars);

        for (Car each :cars) {
            System.out.println(each.brand + " "+ each.model + " : $" + each.price );
        }

        System.out.println("---------------------------------------------");

        // remove Wolkswagen cars year of which 2005-2008
        cars.removeIf(p-> p.brand.equals("Wolkswagen") && p.year >= 2005 && p.year <= 2008 );

        cars.removeIf(p-> p.year<2018);

        System.out.println("cars above year 2018= " + cars);


    }
}
