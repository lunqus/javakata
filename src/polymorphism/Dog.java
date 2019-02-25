package polymorphism;

public class Dog extends Animal {

    private String name;

    @Override
    public void makeSound() {
        System.out.println("Woofff!");
    }

    public void makeSound(String soundType) {
        // super.makeSound(soundType);
        System.out.println(soundType);
    }
}
