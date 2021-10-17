import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {
    @Test
    void testAssertTrueResult() {
        LocalDate localDate = LocalDate.now();
        assertTrue(localDate.getDayOfMonth() == 17, "10 должно быть больше 5");
    }

//    @Test
//    void testSingleFailResult() {
//        System.out.println("Success");
//        assertEquals(4, 2 + 3);
//    }
}
