package Uppgift3;

/**
 * The Cat class represents a specific type of animal, namely a cat.
 */
public class Cat extends Animal {

    /**
     * Produces the sound made by a cat.
     *
     * @return A string representing the sound made by a cat.
     */
    @Override
    public String makeSound() {
        return "Scratching like a funny cat";
    }
}
