import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    @Test
    public void TestNextGreatestLetter_a() {
        assertEquals('b', Character.nextGreatestLetter(new char[] {'a', 'b', 'c'}, 'a'));
    }

    @Test
    public void TestNextGreatestLetter_d() {
        assertEquals('e', Character.nextGreatestLetter(new char[] {'a', 'b', 'c', 'd', 'e', 'f'}, 'd'));
    }
}
