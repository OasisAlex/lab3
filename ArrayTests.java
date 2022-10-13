import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace1() {
    int[] input1 = { };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input2 = { 1, 2, 3, 4 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 4, 3, 2, 1 }, input2);
  }

  @Test
  public void testReverseInPlace3() {
    int[] input3 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input3);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = { 3 };
    assertArrayEquals(new int[]{ 3 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 1, 2, 3 };
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = { 1, 2, 3, 4};
    assertArrayEquals(new int[]{ 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] input1 = { 8, 1, 1, 4};
    assertEquals(4.3333, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void testAverageWithoutLowest4() {
    double[] input1 = {8, 4};
    assertEquals(8.0, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input1 = { 2 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] input1 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }
}
