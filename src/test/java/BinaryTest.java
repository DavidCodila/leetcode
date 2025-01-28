import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTest {
    @Test
    public void TestBinarySearch() {
        assertEquals(-1, Binary.binarySearch(new int[]{}, 0));
    }

    @Test
    public void TestBinarySearchMiddle() {
        assertEquals(3, Binary.binarySearch(new int[] { 1, 2, 3, 4, 7, 9, 11 }, 4));
    }

    @Test
    public void TestBinarySearchLeft() {
        assertEquals(1, Binary.binarySearch(new int[] { 1, 2, 3, 4, 7, 9, 11 }, 2));
    }

    @Test
    public void TestBinarySearchRight() {
        assertEquals(5, Binary.binarySearch(new int[] { 1, 2, 3, 4, 7, 9, 11 }, 9));
    }

    @Test
    public void TestBinarySearchRightMost() {
        assertEquals(6, Binary.binarySearch(new int[] { 1, 2, 3, 4, 7, 9, 11 }, 11));
    }

    @Test
    public void TestBinarySearchLeftMost() {
        assertEquals(0, Binary.binarySearch(new int[] { 1, 2, 3, 4, 7, 9, 11 }, 1));
    }
}
