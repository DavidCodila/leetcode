import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryNumberApplicationTest {

    @Test
    public void testBinaryNumberFor5() {
        BinaryNumberApplication sut = new BinaryNumberApplication();
        String expectedOutput = "Output: true\n" +
                "Explanation: The binary representation of 5 is: 101";
        assertEquals(expectedOutput, sut.hasAlternatingBits(5));
    }
}
