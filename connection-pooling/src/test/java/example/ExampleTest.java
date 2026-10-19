package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ExampleTest { @Test void focusedBehavior(){ var p=new Example.Pool(2); assertTrue(p.acquire()); assertTrue(p.acquire()); assertFalse(p.acquire()); p.release(); assertTrue(p.acquire()); assertEquals(2,p.created()); assertThrows(IllegalStateException.class,()->new Example.Pool(1).release()); } }
