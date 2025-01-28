import org.junit.jupiter.api.Test;

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

}
