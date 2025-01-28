import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTest {
    @Test
    public void TestGetRichestCustomer_11_() {
        assertEquals(
                6,
                Bank.getRichestCustomer(
                        new int[][]{ { 1, 1 } }
                )
        );
    }
}
