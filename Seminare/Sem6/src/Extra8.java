// Write a program that plays tic-tac-toe. The
// tic-tac-toe
// © lepas2004/iStockphoto.
// game is played on a 3 × 3 grid as in the photo at right. The
// game is played by two players, who take turns. The first
// player marks moves with a circle, the second with a cross.
// The player who has formed a horizontal, vertical, or diag-
// onal sequence of three marks wins. Your program should
// draw the game board, ask the user for the coordinates of
// the next mark, change the players after every successful
// move, and pronounce the winner.

import java.util.Scanner;

public class Extra8 {
  public static void main(String[] args) {
    char[][] board = {
        { ' ', ' ', ' ' },
        { ' ', ' ', ' ' },
        { ' ', ' ', ' ' }
    };
    gameLoop(board);
  }

  public static void printBoard(char[][] board) {
    System.out.printf(" %c | %c | %c \n---+---+---\n %c | %c | %c \n---+---+---\n %c | %c | %c \n",
        board[0][0], board[0][1], board[0][2],
        board[1][0], board[1][1], board[1][2],
        board[2][0], board[2][1], board[2][2]);
  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void gameLoop(char[][] board) {
    Scanner scanner = new Scanner(System.in);

    char player = 'O';
    while (true) {
      clearScreen();
      System.out.printf("%c%c%c Player %c%c%c", player, player, player, player, player, player);
      System.out.println();

      printBoard(board);
      System.out.println();
      System.out.print("Enter a position (1-9): ");
      int position = scanner.nextInt();

      while (!validPosition(board, position)) {
        System.out.print("Wrong! Enter a valid position: ");
        position = scanner.nextInt();
      }
      updateBoard(board, position, player);

      int winner = checkForWinner(board);
      if (winner != -2) {
        clearScreen();
        if (winner == 1) {
          System.out.println("Player O wins!");
        } else if (winner == -1) {
          System.out.println("Player X wins!");
        } else {
          System.out.println("It's a Draw");
        }
        System.out.println();
        printBoard(board);
        scanner.close();
        break;
      }

      if (player == 'O') {
        player = 'X';
      } else {
        player = 'O';
      }
    }
  }

  public static void updateBoard(char[][] board, int position, char player) {
    int row = 0;
    int col = 0;
    switch (position) {
      case 1:
        row = 0;
        col = 0;
        break;
      case 2:
        row = 0;
        col = 1;
        break;
      case 3:
        row = 0;
        col = 2;
        break;
      case 4:
        row = 1;
        col = 0;
        break;
      case 5:
        row = 1;
        col = 1;
        break;
      case 6:
        row = 1;
        col = 2;
        break;
      case 7:
        row = 2;
        col = 0;
        break;
      case 8:
        row = 2;
        col = 1;
        break;
      case 9:
        row = 2;
        col = 2;
        break;

      default:
        break;
    }

    board[row][col] = player;
  }

  public static boolean validPosition(char[][] board, int position) {
    if (position < 1 || position > 9) {
      return false;
    }

    int row = 0;
    int col = 0;

    switch (position) {
      case 1:
        row = 0;
        col = 0;
        break;
      case 2:
        row = 0;
        col = 1;
        break;
      case 3:
        row = 0;
        col = 2;
        break;
      case 4:
        row = 1;
        col = 0;
        break;
      case 5:
        row = 1;
        col = 1;
        break;
      case 6:
        row = 1;
        col = 2;
        break;
      case 7:
        row = 2;
        col = 0;
        break;
      case 8:
        row = 2;
        col = 1;
        break;
      case 9:
        row = 2;
        col = 2;
        break;

      default:
        break;
    }

    if (board[row][col] != ' ') {
      return false;
    }
    return true;
  }

  public static int checkForWinner(char[][] board) {
    // 1 player O wins
    // 0 draw
    // -1 player X wins
    // -2 neutral

    int counter = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == ' ') {
          break;
        } else {
          counter++;
        }
      }
    }
    if (counter == 9) {
      return 0;
    }

    // transform the board
    int[][] valueBoard = new int[board.length][board.length];
    // O value 1
    // X value -1
    // _ value 0
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 'O') {
          valueBoard[i][j] = 1;
        } else if (board[i][j] == 'X') {
          valueBoard[i][j] = -1;
        } else {
          valueBoard[i][j] = 0;
        }
      }
    }

    // check primary diagonal
    int primaryValue = valueBoard[0][0] + valueBoard[1][1] + valueBoard[2][2];
    if (primaryValue == 3) {
      return 1;
    } else if (primaryValue == -3) {
      return -1;
    }

    // check secondary diagonal
    int secondaryValue = valueBoard[2][0] + valueBoard[1][1] + valueBoard[0][2];
    if (primaryValue == 3) {
      return 1;
    } else if (secondaryValue == -3) {
      return -1;
    }

    // Check the rows
    for (int i = 0; i < valueBoard.length; i++) {
      int rowValue = 0;
      for (int j = 0; j < valueBoard.length; j++) {
        rowValue += valueBoard[j][i];
      }

      if (rowValue == 3) {
        return 1;
      } else if (rowValue == -3) {
        return -1;
      }
    }
    // Check the cols
    for (int i = 0; i < valueBoard.length; i++) {
      int colValue = 0;
      for (int j = 0; j < valueBoard.length; j++) {
        colValue += valueBoard[i][j];
      }

      if (colValue == 3) {
        return 1;
      } else if (colValue == -3) {
        return -1;
      }
    }

    return -2;
  }
}
