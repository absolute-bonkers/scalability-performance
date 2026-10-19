package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ var hosts=java.util.List.of("a","b","c"); Example.reset(); assertEquals("a",Example.roundRobin(hosts)); assertEquals("b",Example.roundRobin(hosts)); assertEquals("b",Example.leastConnections(java.util.Map.of("a",4,"b",1))); assertTrue(hosts.contains(Example.hash("u1",hosts))); } }
