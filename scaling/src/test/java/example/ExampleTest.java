package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest {
    @Test
    void comparesEqualIllustrativeCapacity() {
        assertEquals(40, Example.horizontal(4, 10).total());
        assertEquals(40, Example.vertical(40).total());
        assertEquals(4, Example.horizontal(4, 10).instances());
    }

    @Test
    void rejectsInvalidOrOverflowingCapacity() {
        assertThrows(IllegalArgumentException.class, () -> Example.horizontal(0, 10));
        assertThrows(ArithmeticException.class, () -> Example.horizontal(Integer.MAX_VALUE, 2).total());
    }
}
