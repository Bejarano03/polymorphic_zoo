/**
 * Monkey subclass
 *
 * @author Marco Bejarano Oseguera
 * @version 1/26/2025
 */

public class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Ou Ou Aa");
    }
}
