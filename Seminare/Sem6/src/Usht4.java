// Write a method public static void removeMin that removes the minimum value from a
// partially filled array without calling other methods.

import java.util.Arrays;

public class Usht4 {
  public static void main(String[] args) {
    int[] array = new int[5];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    int arraySize = 4;

    System.out.println("Original Array");
    System.out.println(Arrays.toString(array));
    System.out.println("Modified Array");
    removeMin(array, arraySize);
  }

  public static void removeMin(int[] array, int size) {
    int min = Integer.MAX_VALUE;
    int min_index = 0;

    for (int i = 0; i < size; i++) {
      if (array[i] < min) {
        min = array[i];
        min_index = i;
      }
    }

    // remove the min value
    for (int i = min_index; i < size - 1; i++) {
      array[i] = array[i + 1];
    }

    array[size - 1] = 0;

    System.out.println(Arrays.toString(array));
  }
}
