// Ndërtoni një metodë statike që merr si parametër një tabelë dhe kthen mbrapsht sekuencën e
// elementëve. Për shembull nëse metoda thërritet me vlerat 1 4 8 9 16 metoda do të kthejë 16 9 8 4 1.

import java.util.Arrays;

public class Usht6 {
  public static void main(String[] args) {
    int[] array = { 1, 4, 8, 9, 16 };

    System.out.println("Original Array");
    System.out.println(Arrays.toString(array));
    System.out.println("Reversed Array");
    reverseArray(array);
    System.out.println(Arrays.toString(array));
  }

  public static void reverseArray(int[] array) {
    int start = 0;
    int end = array.length - 1;

    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;

      start++;
      end--;
    }
  }
}
