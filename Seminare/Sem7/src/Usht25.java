// Write a method that checks whether all elements in a two-dimensional array are
// identical.

public class Usht25 {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 1, 1 },
        { 1, 1, 1 },
        { 1, 1, 1 }
    };
    System.out.println(areIdentical(matrix));
  }

  public static boolean areIdentical(int[][] matrix) {

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length - 1; j++) {
        if (matrix[i][j] != matrix[i][j + 1]) {
          return false;
        }
      }
    }
    return true;
  }

}
