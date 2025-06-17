package org.example.ZooEcosystem.ZooInstruction;

public class Parrot extends Bird {

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " likes to eat sunflower seeds.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " likes to repeat human words.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Parrot: " + name + ", Age: " + age);
    }
}
