package cc.xpbootcamp.warmup.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    void should_return_1_when_calculate_given_position_1() {
        int position = 1;
        long expectedValue = 1;

        long actualValue = Fibonacci.calculate(position);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void should_return_1_when_calculate_given_position_2() {
        int position = 2;
        long expectedValue = 1;

        long actualValue = Fibonacci.calculate(position);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void should_return_2_when_calculate_given_position_3() {
        int position = 3;
        long expectedValue = 2;

        long actualValue = Fibonacci.calculate(position);

        assertEquals(expectedValue, actualValue);

    }
}
