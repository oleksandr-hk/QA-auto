package lesson3;

public class Dog extends Animal{

    @Override
    protected void makeSound() {
        System.out.println("Dog barking");
    }

    protected void fetch() {
        System.out.println("Bring a stick");
    }

}
