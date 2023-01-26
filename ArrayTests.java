import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = { 20, 37, 98 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 98, 37, 20 }, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = { 20, 37, 98 };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{ 98, 37, 20 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 4, 1, 1, 6 };
    assertEquals(5, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }
}
