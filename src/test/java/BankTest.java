import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTest {
    @Test
    public void TestGetRichestCustomerEmpty() {
        assertEquals(
                0,
                Bank.getRichestCustomerWealth(
                        new int[][]{ { } }
                )
        );
    }

    @Test
    public void TestGetRichestCustomer_11() {
        assertEquals(
                2,
                Bank.getRichestCustomerWealth(
                        new int[][]{ { 1, 1 } }
                )
        );
    }

    @Test
    public void TestGetRichestCustomer_11_22_33() {
        assertEquals(
                6,
                Bank.getRichestCustomerWealth(
                        new int[][]{ { 1, 1 }, { 2, 2 }, { 3, 3 } }
                )
        );
    }

    @Test
    public void TestGetRichestCustomerNegative_11() {
        assertEquals(
                0,
                Bank.getRichestCustomerWealth(
                        new int[][]{ { -1, -1 } }
                )
        );
    }
}
