import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testAppend() {
        LinkedList input1 = new LinkedList();
        input1.append(5);
        input1.append(10);
        input1.append(11);
        assertEquals("5 10 11 ", input1.toString());
    }

    
}
