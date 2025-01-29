import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    @Test
    public void TestNextGreatestLetterEmpty() {
        assertEquals(' ', Character.nextGreatestLetter(new char[] {' '}, ' '));
    }

    @Test
    public void TestNextGreatestLetter_a() {
        assertEquals('b', Character.nextGreatestLetter(new char[] {'a', 'b', 'c'}, ' '));
    }
}
