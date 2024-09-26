import com.axel.FindNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindNumberTest {
    @Test
    public void testEmptyArray() {
        // Test 1: Empty array
        assertEquals(0, FindNumber.findMissingNumber(new int[]{}));
    }

    @Test
    public void testSingleElementZero() {
        // Test 2: An array with one element (0)
        assertEquals(1, FindNumber.findMissingNumber(new int[]{0}));
    }

    @Test
    public void testSingleElementNonZero() {
        // Test 3: An array with one element (not 0)
        assertEquals(6, FindNumber.findMissingNumber(new int[]{5}));
    }

    @Test
    public void testSequentialArrayWithoutMissing() {
        // Test 4: An array with no missing
        assertEquals(5, FindNumber.findMissingNumber(new int[]{0, 1, 2, 3, 4}));
    }

    @Test
    public void testArrayWithMissingNumber() {
        // Test 5: An array with a missing member in the middle
        assertEquals(3, FindNumber.findMissingNumber(new int[]{0, 1, 2, 4}));
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        // Test 6: Array with negative numbers
        assertEquals(2, FindNumber.findMissingNumber(new int[]{-1, 0, 1, 3}));
    }

    @Test
    public void testArrayWithNegativeNumbersWithoutMissing() {
        // Test 7: Array with negative numbers without omissions
        assertEquals(1, FindNumber.findMissingNumber(new int[]{-3, -2, -1, 0}));
    }

    @Test
    public void testArrayWithDuplicates() {
        // Test 8: An array with duplicates
        assertEquals(4, FindNumber.findMissingNumber(new int[]{0, 1, 1, 2, 3}));
    }

    @Test
    public void testArrayWithAllNegativeNumbers() {
        // Test 9: An array where all numbers are negative
        assertEquals(0, FindNumber.findMissingNumber(new int[]{-3, -2, -1}));
    }

    @Test
    public void testShuffledArrayWithMissingNumber() {
        // Test 10: An array with mixed numbers
        assertEquals(2, FindNumber.findMissingNumber(new int[]{3, 0, 1, 4}));
    }
}
