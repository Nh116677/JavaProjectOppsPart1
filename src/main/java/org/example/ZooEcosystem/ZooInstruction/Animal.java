package org.example.ZooEcosystem.ZooInstruction;

public abstract class Animal implements AnimalBehaviour {
    //Abstract Class Animal: Implements AnimalBehavior.
    // This class serves as the base for all animal types,
    // providing implementation for some methods of AnimalBehavior
    // that are common across all animals, such as sleep(), and defining
    // abstract methods like displayInformation() to show details about the animal.

    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Common implementation
    @Override
    public void sleep(){
        System.out.println(name + " is sleeping peacefully.");
    }
    //Abstract method
    public abstract void displayInformation();
}
