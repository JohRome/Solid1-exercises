package Uppgift3;

/**
 * The Dog class represents a specific type of animal, namely a dog.
 */
public class Dog extends Animal {

    /**
     * Produces the sound made by a dog.
     *
     * @return A string representing the sound made by a dog.
     */
    @Override
    public String makeSound() {
        return "Barking like a mad hound";
    }
}
