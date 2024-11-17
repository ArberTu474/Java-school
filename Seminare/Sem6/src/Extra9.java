// The Game of Life is a well-known mathematical game that gives rise to amazingly
// complex behavior, although it can be specified by a few simple rules. (It is not
// actu­ally a game in the traditional sense, with players competing for a win.) Here are
// the rules. The game is played on a rectangular board. Each square can be either
// empty or occupied. At the beginning, you can specify empty and occupied cells in
// some way; then the game runs automatically. In each
// generation, the next generation is computed. A new cell is
// born on an empty square if it is surrounded by exactly
// three occupied neighbor cells. A cell dies of overcrowding
// if it is surrounded by four or more neighbors, and it dies of
// loneliness if it is surrounded by zero or one neighbor. A
// neighbor is an occupant of an adjacent square to the left,
// Figure 20 right, top, or bottom or in a diagonal direction. Figure 20
// shows a cell and its neighbor cells.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Extra9 {
  public static void main(String[] args) {
    final int WIDTH = 80;
    final int HEIGHT = 80;

    char[][] baseBgrid = new char[HEIGHT][WIDTH];
    readCSV(baseBgrid);

    for (int i = 0; i < 250; i++) {
      System.out.println("Gen: " + (i + 1));
      printGrid(newGen(baseBgrid, i));
      try {
        if (i == 0) {
          Thread.sleep(1200); // Sleep for one second
        }
        Thread.sleep(300); // Sleep for one second
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }

  }

  public static void readCSV(char[][] grid) {
    System.out.println(System.getProperty("user.dir"));
    String file = "../files/base.csv";
    BufferedReader reader = null;

    String line = "";

    try {
      reader = new BufferedReader(new FileReader(file));
      System.out.println("Hello");
      int i = 0;
      while ((line = reader.readLine()) != null) {
        String[] row = line.split(",");

        for (int j = 0; j < grid.length; j++) {
          // grid[i][j] = row[j].charAt(0);
          if (row[j].charAt(0) == '0') {
            grid[i][j] = '░';
          } else {
            grid[i][j] = '█';
          }
        }
        i++;
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        reader.close();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  public static void printGrid(char[][] grid) {
    for (char[] row : grid) {
      for (char element : row) {
        System.out.print(element);
      }
      System.out.println();
    }
  }

  public static char[][] newGen(char[][] grid, int generations) {

    while (generations > 0) {
      char[][] newGrid = new char[grid.length][];
      for (int i = 0; i < grid.length; i++) {
        newGrid[i] = Arrays.copyOf(grid[i], grid[i].length);
      }

      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
          if (doesItLive(grid, i, j)) {
            newGrid[i][j] = '█';
          } else {
            newGrid[i][j] = '░';

          }
        }
      }
      generations--;
      grid = newGrid;
    }

    return grid;
  }

  public static boolean doesItLive(char[][] grid, int row, int col) {
    final int[] rowOffsets = { -1, -1, -1, 0, 0, 1, 1, 1 };
    final int[] columnOffsets = { -1, 0, 1, -1, 1, -1, 0, 1 };

    if (grid[row][col] == '░') {
      // Check if it will be born

      int neighbors = 0;

      for (int i = 0; i < rowOffsets.length; i++) {

        int newRow = row + rowOffsets[i];
        int newCol = col + columnOffsets[i];

        if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
            && grid[newRow][newCol] == '█') {
          neighbors++;
          if (neighbors > 3) {
            return false;
          }
        }

      }
      if (neighbors < 3) {
        return false;
      }

    } else {
      // Check if it dies
      int neighbors = 0;

      for (int i = 0; i < rowOffsets.length; i++) {
        int newRow = row + rowOffsets[i];
        int newCol = col + columnOffsets[i];

        if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
            && grid[newRow][newCol] == '█') {
          neighbors++;

        }
      }

      if (neighbors <= 1 || neighbors >= 4) {
        return false;
      }
    }

    return true;
  }
}
