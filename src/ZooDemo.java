/**
 * This program loops over a few animal packages
 * (Lion, Elephant and Monkey) and displays their ]
 * respective sound.
 *
 * @author Marco Bejarano Oseguera
 * @version 1/26/2025
 */

import java.util.ArrayList;

public class ZooDemo {
    public static void main(String[] args) {
        Lion myLion = new Lion("Simba");
        Elephant myElephant = new Elephant("Ellie");
        Monkey myMonkey = new Monkey("Abou");

        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(myLion);
        zoo.add(myElephant);
        zoo.add(myMonkey);

        for (Animal animal : zoo) {
            System.out.println(animal.getName() + ":");
            animal.makeSound();
            System.out.println();

            animal.makeSound(3);
            System.out.println();
        }
    }
}
