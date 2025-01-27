/**
 * Lion subclass
 *
 * @author Marco Bejarano Oseguera
 * @version 1/26/2025
 */

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

}
