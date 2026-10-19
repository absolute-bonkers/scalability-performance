package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ assertEquals("primary",Example.write().node()); assertEquals("replica",Example.read(true,true).node()); assertEquals("primary",Example.read(false,true).node()); assertEquals("primary",Example.read(true,false).node()); } }
