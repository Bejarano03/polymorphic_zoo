/**
 *Testing normal cases and edge cases
 *
 * @author Marco Bejarano Oseguera
 * @version 1/26/2025
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    private Animal lion;
    private Animal elephant;
    private Animal monkey;

    @BeforeEach
    void setup() {
        lion = new Lion("Simba");
        elephant = new Elephant("Dumbo");
        monkey = new Monkey("George");
    }

    @Test
    void testLion() {
        assertDoesNotThrow(() -> lion.makeSound());
    }

    @Test
    void testElephant() {
        assertDoesNotThrow(() -> elephant.makeSound());
    }

    @Test
    void testMonkey() {
        assertDoesNotThrow(() -> monkey.makeSound());
    }

    @Test
    void testZeroSound() {
        assertDoesNotThrow(() -> lion.makeSound(0));
    }

    @Test
    void testLargeSound() {
        assertDoesNotThrow(() -> lion.makeSound(1000));
    }

    @Test
    void testNegativeSound() {
        assertDoesNotThrow(() -> lion.makeSound(-1));
    }

}