import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNumbersTest {
    @Test
    public void TestFindEvenNumberOfDigitsWithEmptyArray() {
        assertEquals(0, FindNumbers.findEvenNumberOfDigits(new int[] { }));
    }

    @Test
    public void TestFindEvenNumberOfDigits0() {
        assertEquals(0, FindNumbers.findEvenNumberOfDigits(new int[] { 0 }));
    }

    @Test
    public void TestFindEvenNumberOfDigits1() {
        assertEquals(0, FindNumbers.findEvenNumberOfDigits(new int[] { 1 }));
    }

    @Test
    public void TestFindEvenNumberOfDigits12() {
        assertEquals(1, FindNumbers.findEvenNumberOfDigits(new int[] { 11 }));
    }

    @Test
    public void TestFindEvenNumberOfDigits12_345_2_6_7896() {
        assertEquals(2, FindNumbers.findEvenNumberOfDigits(new int[] { 12, 345, 2, 6, 7896 }));
    }

    @Test
    public void TestFindEvenNumberOfDigitsNegative11() {
        assertEquals(1, FindNumbers.findEvenNumberOfDigits(new int[] { -11 }));
    }

    @Test
    public void TestSearchRangeFailedToFindNumber() {
        assertArrayEquals(new int[]{-1, -1}, FindNumbers.searchRange(new int[]{}, 1));
    }

    @Test
    public void TestSearchRangeFor3OccurrencesOf5() {
        assertArrayEquals(new int[]{4, 6}, FindNumbers.searchRange(new int[] { 1, 2, 3, 3, 5, 5, 5, 6, 8, 8, 10}, 5));
    }

    @Test
    public void TestFindPeakIndexInMountainArray0_1_0() {
        assertEquals(1, FindNumbers.findPeakIndexInMountainArray(new int[] { 0, 1, 0}));
    }

    @Test
    public void TestFindPeakIndexInMountainArray0_1_2_3_2_1() {
        assertEquals(3, FindNumbers.findPeakIndexInMountainArray(new int[] { 0, 1, 2, 3, 2, 1}));
    }

    @Test
    public void TestFindPeakIndexInMountainArray0_4_3_2_1() {
        assertEquals(1, FindNumbers.findPeakIndexInMountainArray(new int[] { 0, 4, 3, 2, 1}));
    }

    @Test
    public void TestFindInMountainArray0_4_3_2_1_Find4() {
        MountainArray mountainArray = new MountainArray(new int[] { 0, 4, 3, 2, 1});
        assertEquals(1, FindNumbers.findInMountainArray(4, mountainArray));
    }

}
