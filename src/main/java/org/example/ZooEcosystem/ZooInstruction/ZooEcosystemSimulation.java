package org.example.ZooEcosystem.ZooInstruction;

public class ZooEcosystemSimulation {
    public static void main(String[] args) {
        Animal lion = new Lion("Nala", 10);
        Animal elephant = new Elephant("Ari", 19);
        Animal eagle = new Eagle("Ariel", 5);
        Animal parrot = new Parrot("Kiara", 9);

        Animal[] zooAnimals = {lion, elephant, parrot, eagle};

        for (Animal animal : zooAnimals) {
            animal.eat();
            animal.sleep();
            animal.makeSound();
            animal.displayInformation();
            System.out.println("----- ");
        }
        Registration reg = new Registration();
        reg.setEmail("zookeeper@yahoo.com");
        reg.setUserName("ZooMaster2025");
        reg.setPassword("SuperSecure123");
        reg.displayUserInfo();
    }
}



