import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void testStringReorganizeWithAAAABB() {
        assertEquals("", ReorganizeStringApplication.reorganizeString("aaaabb"));
    }

    @Test
    public void testStringReorganizeWithABCCCDFE() {
        assertEquals("acbcdcfe", ReorganizeStringApplication.reorganizeString("abcccdfe"));
    }

    @Test
    public void testStringReorganizeWithAAAABCDFE() {
        assertEquals("abacadafe", ReorganizeStringApplication.reorganizeString("aaaabcdfe"));
    }

    @Test
    public void testStringReorganizeWithAAAA() {
        assertEquals("", ReorganizeStringApplication.reorganizeString("aaaa"));
    }

    @Test
    public void testStringReorganizeWithEmptyInput() {
        InvalidParameterException exception =
                assertThrows(InvalidParameterException.class, () -> ReorganizeStringApplication.reorganizeString("")
        );
        assertEquals(exception.getMessage(), "Input can not be empty");
    }

    @Test
    public void testStringReorganizeWithOver500CharacterInput() {
        String largeInput = String.valueOf(new char[501]);
        InvalidParameterException exception =
                assertThrows(InvalidParameterException.class, () -> ReorganizeStringApplication.reorganizeString(largeInput)
        );
        assertEquals(exception.getMessage(), "Input can not exceed 500 characters");
    }

    @Test
    public void testStringReorganizeWithUppercaseABBCInput() {
        InvalidParameterException exception =
                assertThrows(InvalidParameterException.class, () -> ReorganizeStringApplication.reorganizeString("ABBC")
        );
        assertEquals(exception.getMessage(), "Input must consist of only lowercase letters");
    }

}
