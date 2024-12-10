// Write a method that finds the first occurrence of a value in a two-dimensional array.
// Return an int[] array of length 2 with the row and column, or null if the value was
// not found.

import java.util.Arrays;

public class Usht24 {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    System.out.println(Arrays.toString(valueIndex(matrix, 10)));
  }

  public static int[] valueIndex(int[][] matrix, int value) {
    int[] result = new int[2];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] == value) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }

    return null;
  }
}
