import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorganizeStringApplicationTest {
    private final ReorganizeStringApplication reorganizeStringapplication = new ReorganizeStringApplication();

    @Test
    public void testStringReorganizeWithAAB() {
        assertEquals("\"aba\"", reorganizeStringapplication.reorganizeString("aab"));
    }

    @Test
    public void testStringReorganizeWithAAAB() {
        assertEquals("\"\"", reorganizeStringapplication.reorganizeString("aaab"));
    }

    @Test
    public void testStringReorganizeWithAABCCDEFGH() {
        assertEquals("\"bab\"", reorganizeStringapplication.reorganizeString("bba"));
    }

}
