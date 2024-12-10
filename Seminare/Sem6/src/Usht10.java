// 10. Ndërtoni një program që gjeneron 20 numra rasti me vlerë midis 0 dhe 99 në një tabelë. Programi
// afishon sekuencën, i rendit ato dhe më pas afishon sekuencën e renditur. Përdorni metodën sort nga
// libraria e Javës.

import java.util.Arrays;
import java.util.Random;

public class Usht10 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] numbers = new int[20];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }

    System.out.println("Original Array: ");
    System.out.println(Arrays.toString(numbers));
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
  }
}
