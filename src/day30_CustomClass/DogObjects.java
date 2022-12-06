package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Kara";
        dog1.breed = "Pitbull";
        dog1.age = 3;
        dog1.gender= 'F';
        dog1.size= "Medium";
        dog1.color="Black";

        Dog dog2 = new Dog();
        dog2.name ="Dora";
        dog2.breed = "Husky";
        dog2.age = 2;
        dog2.gender='M';
        dog2.size="Large";
        dog2.color="White&Black";

        Dog dog3 = new Dog();

        dog3.setInfo("Dogan", "German", 56, 'M', "Xtra Large", "White");

        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);
        System.out.println("dog3 = " + dog3);

        dog1.eat();
        dog3.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Pamuk", "Pug", 5, 'M', "Small", "Brown");

        Dog dog5 = new Dog();
        dog5.setInfo("Tansu", "Doberman", 7, 'F',"Large", "Black&Brown");

        Dog [] dogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dogs));
        femaleDogs.removeIf(p-> p.gender=='M');
        System.out.println("femaleDogs = " + femaleDogs);
        int numberOfFemales = femaleDogs.size();
        System.out.println("numberOfFemales = " + numberOfFemales);

        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dogs));
        maleDogs.removeIf(p-> p.gender=='F');
        System.out.println("maleDogs = " + maleDogs);
        int numberOfMales = maleDogs.size();
        System.out.println("numberOfMales = " + numberOfMales);





    }

}
