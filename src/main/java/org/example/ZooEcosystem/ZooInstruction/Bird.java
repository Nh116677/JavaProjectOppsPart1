package org.example.ZooEcosystem.ZooInstruction;

public abstract class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);}

        @Override
        public void eat () {
            System.out.println(name + "the bird is pecking food.");
        }

        @Override
        public void makeSound () {
            System.out.println(name + "the bird is chirping.");
        }

        @Override
        public void displayInformation () {
            System.out.println("Bird Name: " + name + ", Age: " + age);
        }

    }

