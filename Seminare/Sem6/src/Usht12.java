// Ndërtoni një metodë që llogarit mesataren e vlerave të fqinjëve të një tabele dydimensionale
// sipas tetë drejtimeve.
// public static double neighborAverage(int[][] values, int row, int column)
// nëse rreshti dhe kolona janë të dyja 0, atëherë do të kemi tre fqinj.

public class Usht12 {
  public static void main(String[] args) {

    int[][] matrix = {
        { 1, 2, 4, 5 },
        { 3, 9, 2, 6 },
        { 5, 7, 8, 9 }
    };
    System.out.println("Average: " + neighborAverage(matrix, 0, 0));
  }

  public static double neighborAverage(int[][] values, int row, int column) {
    int[] rowOffsets = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
    int[] columnOffsets = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };

    int sum = 0;
    int count = 0;

    for (int i = 0; i < rowOffsets.length; i++) {
      int newRow = row + rowOffsets[i];
      int newCol = row + columnOffsets[i];

      if (newRow >= 0 && newRow < values.length && newCol >= 0 && newCol < values[0].length) {
        sum += values[newRow][newCol];
        count++;
      }

    }

    return (double) sum / count;
  }
}
