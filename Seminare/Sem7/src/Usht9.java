// Implementoni algoritmin e mëposhtëm për të ndërtuar një katror magjik n x n; Ky algoritëm
// funksionon vetëm nëse n është tek.

// Shembull i një katrori 5x5 i ndërtuar sipas kësaj metode.
// Ndërtoni një program i cili merr si input numrin n dhe ka output katrorin magjik të rendit n, ku n
// është numër tek.

import java.util.Arrays;
import java.util.Scanner;

public class Usht9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = 0;
    while (n % 2 == 0) {
      System.out.print("Enter a odd number: ");
      n = scanner.nextInt();
    }

    int[][] magicSquare = createMagicSquare(n);
    printMagicSquare(magicSquare);
    scanner.close();
  }

  public static int[][] createMagicSquare(int n) {
    int[][] square = new int[n][n];

    for (int[] array : square) {
      Arrays.fill(array, 0);
    }

    int row = 0;
    int col = n / 2;
    int num = 1;

    while (num <= n * n) {
      square[row][col] = num;

      int newRow = (row - 1 + n) % n;
      int newCol = (col + 1) % n;

      if (square[newRow][newCol] != 0) {
        newRow = (row + 1) % n;
        newCol = col;
      }

      row = newRow;
      col = newCol;
      num++;
    }

    return square;
  }

  public static void printMagicSquare(int[][] square) {
    for (int[] array : square) {
      System.out.println(Arrays.toString(array));
    }
  }
}
