package org.example.ZooEcosystem.ZooInstruction;

import javax.xml.namespace.QName;

public class Eagle extends Bird {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + "like is eat fish.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + "usually have a high-pitched whistle sound.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Eagle: " + name + ", Age: " + age);
    }

}


