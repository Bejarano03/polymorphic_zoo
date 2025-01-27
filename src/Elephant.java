/**
 * Elephant subclass
 *
 * @author Marco Bejarano Oseguera
 * @version 1/26/2025
 */

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Toot");
    }
}
