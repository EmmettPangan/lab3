import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTest {
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<>(Arrays.asList("hi", "sup", "hello", "howdy", "wassup"));
        StringChecker hGreeting = new StringChecker() {
            @Override
            public boolean checkString(String s) {
                if (s.contains("h")) {
                    return true;
                }
                return false;
            }
        };
        assertEquals(new ArrayList<String>(Arrays.asList("hi", "hello", "howdy")), ListExamples.filter(input1, hGreeting));
    }

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> input2 = new ArrayList<>(Arrays.asList("b", "d", "e", "f"));
        assertEquals(new ArrayList<String>(Arrays.asList("a", "b", "b", "c", "d", "e", "f")), ListExamples.merge(input1, input2));
    }
}
