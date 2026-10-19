package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ var e=Example.estimate(86400,1,2,100,1); assertEquals(1,e.averageRps()); assertEquals(2,e.peakRps()); assertEquals(1,e.instances()); assertEquals(3,Example.estimate(86400,1,3,100,.01).instances()); } }
