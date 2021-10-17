import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathTest {
    @Test
    public void testSqrCircle() {
        double result = ProblemTwo.getCircleSquare(3);
        assertEquals(28.259999999999998, result);
    }
}
