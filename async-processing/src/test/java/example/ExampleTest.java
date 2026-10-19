package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ var q=new Example(1); assertTrue(q.submit("email")); assertFalse(q.submit("report")); assertEquals("email",q.workOne()); assertNull(q.workOne()); assertTrue(q.submit("report")); } }
