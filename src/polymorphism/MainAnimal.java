package polymorphism;

public class MainAnimal {


    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Animal dog2 = new Dog();

        dog1.makeSound();
        dog2.makeSound();

        dog1.makeSound("WooWoohhh!");

    }

}
