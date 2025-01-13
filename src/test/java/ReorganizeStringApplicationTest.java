import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorganizeStringApplicationTest {

    @Test
    public void testStringReorganizeWithAABLowercase() {
        ReorganizeStringApplication sut = new ReorganizeStringApplication();
        String expectedOutput = "Input: s = \"aab\"\n" +
                "Output: \"aba\"";
        assertEquals(expectedOutput, sut.reorganizeString("aab"));
    }

    @Test
    public void testStringReorganizeWithAAABLowercase() {
        ReorganizeStringApplication sut = new ReorganizeStringApplication();
        String expectedOutput = "Input: s = \"aaab\"\n" +
                "Output: \"\"";
        assertEquals(expectedOutput, sut.reorganizeString("aaab"));
    }

}
