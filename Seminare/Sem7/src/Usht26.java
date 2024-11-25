// Write a method that checks whether all elements in a two-dimensional array are
// distinct.

public class Usht26 {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    System.out.println(areDistinct(matrix));
  }

  public static boolean areDistinct(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length - 1; j++) {
        if (matrix[i][j] == matrix[i][j + 1]) {
          return false;
        }
      }
    }
    return true;
  }
}
