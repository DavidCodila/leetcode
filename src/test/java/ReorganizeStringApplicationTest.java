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
        assertEquals("abac", ReorganizeStringApplication.reorganizeString("aabc"));
    }

    @Test
    public void testStringReorganizeWithABCC() {
        assertEquals("acbc", ReorganizeStringApplication.reorganizeString("abcc"));
    }

    @Test
    public void testStringReorganizeWithAAAAB() {
        assertEquals("", ReorganizeStringApplication.reorganizeString("aaaab"));
    }

    @Test
    public void testStringReorganizeWithABCCCDFE() {
        assertEquals("acbcdcfe", ReorganizeStringApplication.reorganizeString("abcccdfe"));
    }

    @Test
    public void testStringReorganizeWithAAAABCDFE() {
        assertEquals("abacadafe", ReorganizeStringApplication.reorganizeString("aaaabcdfe"));
    }

}
