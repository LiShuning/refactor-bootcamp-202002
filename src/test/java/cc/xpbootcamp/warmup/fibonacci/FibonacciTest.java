package cc.xpbootcamp.warmup.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void should_return_0_when_calculate_given_position_0() {
        int position = 0;
        long expectedValue = 0;

        long actualValue = Fibonacci.calculate(position);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void should_return_12586269025L_when_calculate_given_position_50() {
        int position = 50;
        long expectedValue = 12586269025l;

        long actualValue = Fibonacci.calculate(position);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void should_throw_exception_when_calculate_given_position__minus_1() {
        int position = -1;

        assertThrows(PositionNoValidException.class, () -> {
           Fibonacci.calculate(position);
        });
    }
}
