package org.example.ZooEcosystem;

public class Elephant extends Mammal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + "like to eat leaves.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + "trumpets loudly!");
    }

    @Override
    public void displayInformation() {
        System.out.println("Elephant: " + name + ", Age: " + age);
    }

}

