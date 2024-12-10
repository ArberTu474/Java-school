import java.util.Arrays;
import java.util.Scanner;

public class Usht13 {
  public static void main(String[] args) {

    int[][] magicSquare = new int[4][4];
    // int[][] magicSquare = {
    // { 16, 3, 2, 13 },
    // { 5, 10, 11, 8 },
    // { 9, 6, 7, 12 },
    // { 4, 15, 14, 1 }
    // };
    fillMagicSquare(magicSquare);

    print2dArray(magicSquare);
    System.out.println("Is Magic Square: " + isMagicSquare(magicSquare));
  }

  public static boolean isMagicSquare(int[][] square) {

    if (primaryDiagonalSum(square) != secondaryDiagonalSum(square)) {
      return false;
    }

    for (int i = 0; i < square.length - 1; i++) {
      if (rowSum(square, i) != rowSum(square, i)) {
        return false;
      }
    }

    for (int i = 0; i < square.length - 1; i++) {
      if (colSum(square, i) != rowSum(square, i)) {
        return false;
      }
    }

    return true;
  }

  public static void fillMagicSquare(int[][] magicSquare) {
    final int N = magicSquare.length;
    int[] avaialbeNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

    System.out.println("Enter your numbers:");
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        System.out.print(">>> ");
        int temp = scanner.nextInt();
        if (!contains(avaialbeNumbers, temp)) {
          System.out.println("Plase add a number between 1-16: ");
          j--;
          continue;
        } else if (contains(magicSquare, temp)) {
          System.out.println("You can not add a number twice: ");
          j--;
          continue;
        } else {
          magicSquare[i][j] = temp;
        }
      }
    }
    scanner.close();
  }

  public static void print2dArray(int[][] array) {
    for (int[] x : array) {
      System.out.println(Arrays.toString(x));
    }
  }

  public static boolean contains(int[] array, int value) {
    for (int element : array) {
      if (element == value) {
        return true;
      }
    }

    return false;
  }

  public static boolean contains(int[][] matrix, int value) {
    for (int row[] : matrix) {
      for (int element : row) {
        if (element == value) {
          return true;
        }
      }
    }

    return false;
  }

  public static int rowSum(int[][] matrix, int row) {
    int sum = 0;
    for (int i = 0; i < matrix[row].length; i++) {
      sum += matrix[row][i];
    }

    return sum;
  }

  public static int colSum(int[][] matrix, int col) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][col];
    }

    return sum;
  }

  public static int primaryDiagonalSum(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }

    return sum;
  }

  public static int secondaryDiagonalSum(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][matrix.length - 1 - i];
    }

    return sum;
  }
}
