    /*Task: Zoo Ecosystem Simulation

1. Overview: Design a software simulation for a zoo ecosystem.
   The simulation will focus on different types of animals, their behaviors, and how they interact with their environment.
   This task will involve creating a hierarchy of animal classes, implementing interfaces for animal behaviors,
   and utilizing abstract classes and methods to define common traits and actions.


Part 1: Defining the Base Structure

    Interface AnimalBehavior: Defines methods eat(), sleep(), and makeSound().
    These methods represent common actions that all animals in the zoo might perform,
    but the specifics of these actions will vary depending on the animal type.

    Abstract Class Animal: Implements AnimalBehavior. This class serves as the base for all animal types,
    providing implementation for some methods of AnimalBehavior that are common across all animals,
    such as sleep(), and defining abstract methods like displayInformation() to show details about the animal.

************************************************************************************************************************************************
Part 2: Creating Specific Animal Classes

    Class Mammal and Bird: Extend the Animal class. These classes will override the eat(), makeSound(),
    and displayInformation() methods to provide specific behaviors and information display mechanisms for mammals and birds, respectively.

    Further Specialization: Within the Mammal and Bird classes, create specific animals,
    such as Lion, Elephant (Mammals), and Parrot, Eagle (Birds). These specific animal classes
    will override the methods from their parent classes to provide behaviors and sounds unique to each animal.

************************************************************************************************************************************************

Part 3: Implementing Features Using OOP Concepts

    Inheritance: Demonstrated by the class hierarchy starting from Animal to Mammal/Bird to specific animals like Lion, Elephant, etc.

    Polymorphism and Method Overriding: Specific animal classes overriding behavior methods like eat(), makeSound(), and displayInformation().

    Abstraction: The Animal class is abstract, containing both implemented and abstract methods, enforcing a contract for the subclasses.

    Interface Implementation: All animals implement the AnimalBehavior interface, ensuring that they all provide implementations for the methods defined in the interface.

    Constructors: Use in specific animal classes to initialize properties like name, age, or any unique attributes they have.

Task Objective:

    Design the class structure as described, implementing the necessary methods and properties.

    Create a simulation where instances of different animals are created, and their behavior methods are called to demonstrate polymorphism and method overriding.

    Display information about each animal using the displayInformation() method to show how data encapsulation and abstraction are used.

    Testing Your Implementation

    Instantiate various animals in a main method or equivalent entry point of your program.

    Call the methods eat(), makeSound(), and displayInformation() on each instance to see the polymorphic behavior in action.



    Create Registration Class in which you would have variables such as email, userName and password that have an access scope only within its own class. After creating an object of the class, the user should be able to call methods and in each method separately pass values to set users email, username and password.
            Requirements:

    Valid email consider to be only yahoo
    Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid passwords cannot contain userName.

     */