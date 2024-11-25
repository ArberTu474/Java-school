// Write a method that swaps two columns of a two-dimensional array.

import java.util.Arrays;

public class Usht29 {
  public static void main(String[] args) {
    int[][] matrix1 = {
        { 2, 0, 0 },
        { 2, 0, 0 },
        { 2, 0, 0 }
    };
    int[][] matrix2 = {
        { 1, 0, 0 },
        { 1, 0, 0 },
        { 1, 0, 0 }
    };

    printMatrix(matrix1);
    System.out.println();
    printMatrix(matrix2);
    System.out.println();
    swapCols(matrix1, matrix2, 0);
    printMatrix(matrix1);
    System.out.println();
    printMatrix(matrix2);
  }

  public static void swapCols(int[][] a, int[][] b, int col_index) {
    if (a.length != b.length || a[0].length != b[0].length) {
      return;
    }

    if (col_index > a[0].length) {
      return;
    }

    for (int i = 0; i < a.length; i++) {
      int temp = a[i][col_index];
      a[i][col_index] = b[i][col_index];
      b[i][col_index] = temp;
    }

  }

  public static void printMatrix(int[][] matrix) {
    for (int[] array : matrix) {
      System.out.println(Arrays.toString(array));
    }
  }
}
