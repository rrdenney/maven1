
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void testFact3 () { Assertions.assertEquals(6, Factorial.factorialIterative ( 3));}
}
