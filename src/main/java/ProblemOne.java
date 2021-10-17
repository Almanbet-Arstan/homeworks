import java.util.Arrays;
import java.util.Random;

public class ProblemOne {
    private static int[] array;

    public static int[] getArray(){

        if (array == null) {
            generateArray();
        }

        Arrays.stream(array).forEach(x -> System.out.println(x));
        return array;
    }
    public static void generateArray(){
        Random random = new Random();
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }
}
