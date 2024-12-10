// Ndërtoni një program që inicializon një tabelë me dhjetë elementë numra random me vlerë nga 1
// deri në 10 dhe afishon:
// a) Elementët në pozion çift
// b) Të gjithë elementët në pozicion të kundërt
// c) Elementin e parë dhe elementin e fundit

import java.util.Arrays;
import java.util.Random;

public class Usht2 {
  public static void main(String[] args) {
    final int ARRAY_SIZE = 10;
    int[] array = new int[ARRAY_SIZE];

    Random random = new Random();
    for (int i = 0; i < ARRAY_SIZE; i++) {
      array[i] = random.nextInt(100 - 1) + 1;
    }

    System.out.println(Arrays.toString(array));

    // a
    System.out.print("Numbers in even positions: ");
    for (int i = 0; i < array.length; i++) {
      if (i % 2 == 1) {
        System.out.print(array[i] + " ");
      }
    }
    System.out.println();

    // b
    System.out.print("Numbers in reverse ored: ");
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.print(array[i] + " ");

    }
    System.out.println();

    // c
    System.out.print("First and last numbers in an array: ");
    System.out.print(array[0] + " ");
    System.out.print(array[array.length - 1]);
    System.out.println();

  }
}
