package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest {
    @Test
    void estimatesAveragePeakAndRequiredInstances() {
        var estimate = Example.estimate(86400, 1, 2, 100, 1);
        assertEquals(1, estimate.averageRps());
        assertEquals(2, estimate.peakRps());
        assertEquals(1, estimate.instances());
        assertEquals(3, Example.estimate(86400, 1, 3, 100, .01).instances());
    }

    @Test
    void rejectsNonsensicalCapacityInputs() {
        assertThrows(IllegalArgumentException.class, () -> Example.estimate(100, 1, 1, 0, 1));
        assertThrows(IllegalArgumentException.class, () -> Example.estimate(100, 1, 1, 10, 0));
        assertThrows(IllegalArgumentException.class, () -> Example.estimate(100, 1, Double.NaN, 10, 1));
    }
}
