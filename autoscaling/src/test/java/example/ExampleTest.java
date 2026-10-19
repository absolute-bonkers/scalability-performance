package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest {
    @Test
    void adjustsWithinBoundsAndHonorsCooldown() {
        assertEquals(4, Example.decide(3, .85, .70, false, 1, 8));
        assertEquals(3, Example.decide(3, .85, .70, true, 1, 8));
        assertEquals(1, Example.decide(1, .1, .70, false, 1, 8));
        assertEquals(8, Example.decide(8, .99, .70, false, 1, 8));
        assertEquals(1, Example.decide(0, .1, .70, true, 1, 8));
        assertEquals(8, Example.decide(12, .99, .70, true, 1, 8));
    }

    @Test
    void rejectsInvalidConfigurationAndMetrics() {
        assertThrows(IllegalArgumentException.class, () -> Example.decide(2, .8, .7, false, 3, 2));
        assertThrows(IllegalArgumentException.class, () -> Example.decide(2, Double.NaN, .7, false, 1, 8));
    }
}
