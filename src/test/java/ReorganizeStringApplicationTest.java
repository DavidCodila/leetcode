import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorganizeStringApplicationTest {

    @Test
    public void testStringReorganizeWithA() {
        assertEquals("a", ReorganizeStringApplication.reorganizeString("a"));
    }

}
