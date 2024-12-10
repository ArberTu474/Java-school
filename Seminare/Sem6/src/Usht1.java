// Ndërtoni një program që mbush tabelën me 10 numra të rastësishëm të ndryshëm midis 1 dhe
// 100.

import java.util.Arrays;
import java.util.Random;

public class Usht1 {
    public static void main(String[] args) throws Exception {
        final int ARRAY_SIZE = 10;

        int[] array = new int[ARRAY_SIZE];
        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(100 - 1) + 1;
        }

        System.out.println(Arrays.toString(array));
    }
}
