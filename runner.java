// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class 1 (Overriding makeSound())
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Child class 2 (Overriding makeSound())
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class runner {
    public static void main(String[] args) {
        Animal myAnimal; // Parent class reference

        myAnimal = new Dog();  // Assign Dog object
        myAnimal.makeSound();  // Calls Dog's method

        myAnimal = new Cat();  // Assign Cat object
        myAnimal.makeSound();  // Calls Cat's method
    }
}
