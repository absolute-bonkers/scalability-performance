package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ var ring=new Example.Ring(java.util.List.of("a","b")); assertTrue(java.util.List.of("a","b").contains(ring.owner("customer"))); assertThrows(IllegalStateException.class,()->new Example.Ring(java.util.List.of()).owner("x")); } }
