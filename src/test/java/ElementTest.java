import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementTest {
    @Test
    public void TestFindPeakElement() {
        assertEquals(0, Element.findPeakElement(new int[]{}));
    }
}
