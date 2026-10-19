package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ assertTrue(Example.L1_NS<Example.SSD_READ_NS); assertTrue(Example.SSD_READ_NS<Example.DATACENTER_RTT_NS); assertEquals(600000,Example.budget(100000,500000)); } }
