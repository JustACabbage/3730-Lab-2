import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void Positive1Test() {
        assertEquals(120, FactorialCalculator.factorialOf(5));
    }

    @Test
    void Positive2Test() {
        assertEquals(720, FactorialCalculator.factorialOf(6));
    }

    @Test
    void ZeroTest() {
        assertEquals(1, FactorialCalculator.factorialOf(0));
    }
}