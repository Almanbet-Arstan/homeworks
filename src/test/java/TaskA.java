import Homework.TaskA.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskA {
    // тест который проверяет правильно ли калькулятор работает
    @Test
    public void testCalculator() {
        int result = Calculator.calculate(5, 2, "*");
        assertEquals(10, result);
    }
}
