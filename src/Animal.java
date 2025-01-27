/**
 * Animal base class
 *
 * @author Marco Bejarano Oseguera
 * @verions 1/26/2025
 */

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void makeSound(int num){
        for (int i = 0; i < num; i++) {
            makeSound();
        }
    }
}
