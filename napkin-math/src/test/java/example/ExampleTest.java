package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ assertEquals(86400000,Example.requestsPerDay(1000)); assertEquals(2600,Example.serialMicros(100,500,2000)); assertTrue(Example.gib(1000000,1024,2)>1.8); } }
