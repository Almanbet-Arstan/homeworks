import Homework.TaskB.ArrayByUser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskB {
    // массив константа из рандомных чисел
    public static final int[] ARRAY = ArrayByUser.createArray();
    // массив константа состоящий из кол-во чисел и сред-их ариф-их
    public static final double[] AVERAGES = ArrayByUser.getAverages();
    // тест который проверяет на то что размер массива не 0
    @Test
    public void testSizeArray() {
        int result = ArrayByUser.createSizeArray();
        assertTrue(result > 0, "Не правильный размер массива");
    }
    // тест который проверяет что в массиве числа от 1 до 100
    @Test
    public void testValuesArray() {
        boolean result = true;
        for (int i : ARRAY) {
            if (i < 1 || i > 100) {
                result = false;
                break;
            }
        }
        assertTrue(result, "Не правильные значение в массиве");
    }

    // дальше тесты проверяющие что выводятся правильные значения

    @Test
    public void testAverage1() {
        double [] array = AVERAGES;
        boolean result = true;
        double avg1 = array[0];
        int count1 = (int) array[1];
        if(avg1 <= 0 && count1 <= 0)
            result = false;
        assertTrue(result, "Ошибка! (среднее арифметическое от 1 до 30)");
    }

    @Test
    public void testAverage2() {
        double [] array = AVERAGES;
        boolean result = true;
        double avg2 = array[2];
        int count2 = (int) array[3];
        if(avg2 <= 0 && count2 <= 0)
            result = false;
        assertTrue(result, "Ошибка! (среднее арифметическое от 1 до 30)");
    }

    @Test
    public void testAverage3() {
        double [] array = AVERAGES;
        boolean result = true;
        double avg3 = array[4];
        int count3 = (int) array[5];
        if(avg3 <= 0 && count3 <= 0)
            result = false;
        assertTrue(result, "Ошибка! (среднее арифметическое от 1 до 30)");
    }
}
