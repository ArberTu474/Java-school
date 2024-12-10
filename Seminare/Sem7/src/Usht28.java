// Write a method that swaps two rows of a two-dimensional array.

import java.util.Arrays;

public class Usht28 {
  public static void main(String[] args) {
    int[][] matrix1 = {
        { 0, 0, 0 },
        { 2, 2, 2 },
        { 0, 0, 0 }
    };
    int[][] matrix2 = {
        { 0, 0, 0 },
        { 1, 1, 1 },
        { 0, 0, 0 }
    };

    printMatrix(matrix1);
    System.out.println();
    printMatrix(matrix2);
    System.out.println();
    swapRows(matrix1, matrix2, 1);
    printMatrix(matrix1);
    System.out.println();
    printMatrix(matrix2);

  }

  public static void swapRows(int[][] a, int[][] b, int row_index) {
    if (a.length != b.length || a[0].length != b[0].length) {
      return;
    }

    if (row_index > a.length) {
      return;
    }

    for (int i = 0; i < a[0].length; i++) {
      int temp = a[row_index][i];
      a[row_index][i] = b[row_index][i];
      b[row_index][i] = temp;
    }

  }

  public static void printMatrix(int[][] matrix) {
    for (int[] array : matrix) {
      System.out.println(Arrays.toString(array));
    }
  }
}
