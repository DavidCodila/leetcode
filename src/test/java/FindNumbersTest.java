import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNumbersTest {
    @Test
    public void TestFindEvenNumberOfDigits1() {
        assertEquals(0, FindNumbers.findEvenNumberOfDigits(new int[] { 1 }));
    }

    @Test
    public void TestFindEvenNumberOfDigits12() {
        assertEquals(1, FindNumbers.findEvenNumberOfDigits(new int[] { 1, 2 }));
    }

}
