import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ProblemOneTest {
    @Test
    public void testArrayForASC(){
        int[] array = ProblemOne.getArray();

        boolean isArrayOk = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                isArrayOk = false;
                break;
            }
        }
        assertTrue(isArrayOk, "Массив не возрастающий");
    }

    @Test
    public void testIndexValues() {
        int[] array = ProblemOne.getArray();
        boolean isArrayOk = true;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0){
                isArrayOk = false;
                break;
            }
            if (i % 2 != 0 && array[i] % 2 == 0){
                isArrayOk = false;
                break;
            }
        }

        assertTrue(isArrayOk, "Индексы и значения не совпадают");
    }
    @Test
    public void testSums() {
        int[] array = ProblemOne.getArray();

        int sumEven = 0;
        int sumOdd = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0){
                    sumEven += array[i];
            }else {
                sumOdd += array[i];
            }
        }

            assertTrue(sumEven >= sumOdd * 2, "Сумма четных не больше или равна 2");

    }
    @Test
    public void testSum() {
        int[] array = ProblemOne.getArray();

        int sumElement = Arrays.stream(array).sum();

        assertTrue(sumElement <= 30, "Сумма больше 30");
    }
}
