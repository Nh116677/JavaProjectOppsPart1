package org.example.ZooEcosystem;

public class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + "like is eat meat.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + "roars loudly");
    }

    @Override
    public void displayInformation() {
        System.out.println("Lion: " + name + ", Age: " + age);
    }

}


