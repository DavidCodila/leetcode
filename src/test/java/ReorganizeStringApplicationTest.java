import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorganizeStringApplicationTest {

    @Test
    public void testStringReorganizeWithA() {
        assertEquals("a", ReorganizeStringApplication.reorganizeString("a"));
    }

    @Test
    public void testStringReorganizeWithAB() {
        assertEquals("ab", ReorganizeStringApplication.reorganizeString("ab"));
    }

    @Test
    public void testStringReorganizeWithAA() {
        assertEquals("", ReorganizeStringApplication.reorganizeString("aa"));
    }

    @Test
    public void testStringReorganizeWithAABC() {
        assertEquals("abca", ReorganizeStringApplication.reorganizeString("aabc"));
    }

    @Test
    public void testStringReorganizeWithABCC() {
        assertEquals("cabc", ReorganizeStringApplication.reorganizeString("abcc"));
    }

}
