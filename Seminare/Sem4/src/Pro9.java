// The Drunkard’s Walk. A drunkard in a grid of streets randomly picks one of four
// directions and stumbles to the next intersection, then again randomly picks one of
// four directions, and so on. You might think that on average the drunkard doesn’t
// move very far because the choices cancel each other out, but that is actually not
// the case.
// Represent locations as integer pairs (x, y). Implement the drunkard’s walk over 100
// intersections, starting at (0, 0), and print the ending location.

import java.util.Random;

public class Pro9 {
  public static void main(String[] args) {
    final int ITERATIONS = 10;
    final int M_HEIGHT = ITERATIONS * 2 + 1;
    final int M_WIDTH = ITERATIONS * 2 + 1;

    // Map
    final int WALL = 4;
    final int BLANK = 5;
    final int PATH = 6;

    final int xStart = M_WIDTH / 2;
    final int yStart = M_HEIGHT / 2;

    Random random = new Random();

    // Map generation
    int[][] map = new int[M_HEIGHT][M_WIDTH];

    for (int i = 0; i < M_HEIGHT; i++) {
      for (int j = 0; j < M_WIDTH; j++) {
        if ((i == 0 || i == M_HEIGHT - 1) || (j == 0 || j == M_WIDTH - 1)) {
          map[i][j] = WALL;
        } else {
          map[i][j] = BLANK;
        }
      }
      System.out.println();
    }

    // 0 - Up
    // 1 - Down
    // 2 - Left
    // 3 - Right
    map[xStart][yStart] = PATH;

    int x = xStart;
    int y = yStart;

    for (int i = 0; i < ITERATIONS; i++) {
      int direction = random.nextInt(5);

      if (direction == 0) {
        y++;
        map[x][y] = PATH;
      } else if (direction == 1) {
        y--;
        map[x][y] = PATH;
      } else if (direction == 2) {
        x--;
        map[x][y] = PATH;
      } else {
        x++;
        map[x][y] = PATH;
      }
    }

    // Print the map
    for (int i = 0; i < M_HEIGHT; i++) {
      for (int j = 0; j < M_WIDTH; j++) {
        if (map[i][j] == WALL) {
          System.out.print("█");
        } else if (map[i][j] == BLANK) {
          System.out.print(" ");
        } else if (map[i][j] == PATH) {
          System.out.print("◉");
        }
      }
      System.out.println();
    }

    System.out.printf("Starting position: (%d, %d)\n", xStart, yStart);
    System.out.printf("Starting position: (%d, %d)\n", x, y);

  }
}