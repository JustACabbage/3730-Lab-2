import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void PostitiveTest1() {
        assertEquals(120, FactorialCalculator.factorialOf(5));
    }

    @Test
    void PostitiveTest2() {
        assertEquals(720, FactorialCalculator.factorialOf(6));
    }

    @Test
    void ZeroTest() {
        assertEquals(1, FactorialCalculator.factorialOf(0));
    }
}