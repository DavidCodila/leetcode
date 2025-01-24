import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryNumberApplicationTest {
    private final BinaryNumberApplication binaryNumberApplication = new BinaryNumberApplication();

    @Test
    public void testBinaryNumberFor5() {
        assertTrue(binaryNumberApplication.hasAlternatingBits(5));
    }

    @Test
    public void testBinaryNumberFor7() {
        assertFalse(binaryNumberApplication.hasAlternatingBits(7));
    }

    @Test
    public void testBinaryNumberFor11() {
        assertFalse(binaryNumberApplication.hasAlternatingBits(11));
    }

    @Test
    public void testBinaryNumberFor1() {
        assertTrue(binaryNumberApplication.hasAlternatingBits(1));
    }
}
