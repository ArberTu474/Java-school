// Write a method that checks whether two two-dimensional arrays are equal; that is,
// whether they have the same number of rows and columns, and corresponding ele-
// ments are equal.

public class Usht27 {
  public static void main(String[] args) {
    int[][] matrix1 = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    int[][] matrix2 = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    System.out.println(equal(matrix1, matrix2));
  }

  public static boolean equal(int[][] a, int[][] b) {
    if (a.length != b.length || a[0].length != b[0].length) {
      return false;
    }

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (a[i][j] != b[i][j]) {
          return false;
        }
      }
    }

    return true;
  }
}
