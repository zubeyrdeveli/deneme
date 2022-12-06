package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Kara", "Pitbull", 'F', 4, "Medium", "Black" );
        dog.bark();
        dog.eat();
        dog.sleep();
        dog.drink();
        dog.move();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Paşa", "Sarman", 'M', 1, "Small", "Yellow");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();
        System.out.println(cat);



        Tiger tiger = new Tiger();
        tiger.setInfo("Sher", "bangal", 'M', 4, "Large", "Red");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();
        System.out.println(tiger);




    }
}
