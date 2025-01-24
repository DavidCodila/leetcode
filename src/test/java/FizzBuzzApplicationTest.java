import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzApplicationTest {
    @Test
    public void TestCalculateFizzBuzzOutputFor1() {
        assertEquals("1", FizzBuzzApplication.calculateFizzBuzzOutput(1));
    }

    @Test
    public void TestCalculateFizzBuzzOutputFor2() {
        assertEquals("2", FizzBuzzApplication.calculateFizzBuzzOutput(2));
    }

    @Test
    public void TestCalculateFizzBuzzOutputFor3() {
        assertEquals("Fizz", FizzBuzzApplication.calculateFizzBuzzOutput(3));
    }
    
    @Test
    public void TestCalculateFizzBuzzOutputFor4() {
        assertEquals("4", FizzBuzzApplication.calculateFizzBuzzOutput(4));
    }

    @Test
    public void TestCalculateFizzBuzzOutputFor5() {
        assertEquals("Buzz", FizzBuzzApplication.calculateFizzBuzzOutput(5));
    }

    @Test
    public void TestCalculateFizzBuzzOutputFor15() {
        assertEquals("FizzBuzz", FizzBuzzApplication.calculateFizzBuzzOutput(15));
    }
}
