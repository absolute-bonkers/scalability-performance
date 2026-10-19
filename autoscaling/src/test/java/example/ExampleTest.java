package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ assertEquals(4,Example.decide(3,.85,.70,false,1,8)); assertEquals(3,Example.decide(3,.85,.70,true,1,8)); assertEquals(1,Example.decide(1,.1,.70,false,1,8)); assertEquals(8,Example.decide(8,.99,.70,false,1,8)); } }
