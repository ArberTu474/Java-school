// A theater seating chart is implemented as a two-dimensional array of ticket prices,
// like this:

// 10 10 10 10 10 10 10 10 10 10
// 10 10 10 10 10 10 10 10 10 10
// 10 10 10 10 10 10 10 10 10 10
// 10 10 20 20 20 20 20 20 10 10
// 10 10 20 20 20 20 20 20 10 10
// 10 10 20 20 20 20 20 20 10 10
// 20 20 30 30 40 40 30 30 20 20
// 20 30 30 40 50 50 40 30 30 20
// 30 40 50 50 50 50 50 50 40 30

// Write a program that prompts users to
// pick either a seat or a price. Mark sold
// seats by changing the price to 0. When
// a user specifies a seat, make sure it is
// available. When a user specifies a price,
// find any seat with that price.

import java.util.Scanner;

public class Extra7 {
  public static void main(String[] args) {
    int seats[][] = {
        { 10, 10, 10, 10, 0, 0, 0, 10, 10, 10 },
        { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
        { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
        { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
        { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
        { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 }
    };

    Scanner scanner = new Scanner(System.in);
    printSeats(seats);

    while (true) {
      System.out.println("1. To pick a seat.");
      System.out.println("2. To pick a price.");

      System.out.println("Pick your choise: ");
      int choice = scanner.nextInt();

      if (choice == 1) {
        System.out.println("Enter the seat number (1-90): ");
        choice = scanner.nextInt();

        while (choice < 1 || choice > 90) {
          System.out.println("Enter a valid seat number: ");
          choice = scanner.nextInt();
        }

        if (pickSeat(seats, choice)) {
          System.out.println("Enjoy the show! ");
          printSeats(seats);
          break;
        } else {
          System.out.println("Pick another seat.\n");
        }
      } else if (choice == 2) {
        printSeats(seats);
        System.out.println("Pick a price (10,20,30,40,50): ");
        choice = scanner.nextInt();
        while (choice != 10 && choice != 20 && choice != 30 && choice != 40 && choice != 50) {
          System.out.println("Enter a vaild price: ");
          choice = scanner.nextInt();
        }
        if (pickPrice(seats, choice)) {
          System.out.println("Enjoy the show! ");
          printSeats(seats);
          break;
        } else {
          System.out.println("Pick another price.\n");
        }

      } else {
        System.out.println("Enter 1 or 2 as your choice. \n");
      }

    }
    scanner.close();

  }

  public static void printSeats(int seats[][]) {
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_BLACK = "\u001B[30m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_YELLOW = "\u001B[33m";
    final String ANSI_BLUE = "\u001B[34m";
    // final String ANSI_PURPLE = "\u001B[35m";
    final String ANSI_CYAN = "\u001B[36m";
    // final String ANSI_WHITE = "\u001B[37m";

    for (int[] row : seats) {
      for (int seat : row) {
        if (seat == 0) {
          System.out.printf(ANSI_BLACK + "%-2d ", seat);
        } else if (seat == 50) {
          System.out.printf(ANSI_RED + "%-2d ", seat);
        } else if (seat == 40) {
          System.out.printf(ANSI_YELLOW + "%-2d ", seat);
        } else if (seat == 30) {
          System.out.printf(ANSI_GREEN + "%-2d ", seat);
        } else if (seat == 20) {
          System.out.printf(ANSI_CYAN + "%-2d ", seat);
        } else {
          System.out.printf(ANSI_BLUE + "%-2d ", seat);
        }
      }
      System.out.println();
    }
    System.out.print(ANSI_RESET);
  }

  public static boolean pickSeat(int seats[][], int num) {
    int row = (num - 1) / seats[0].length;
    int col = (num - 1) % seats[0].length;

    if (seats[row][col] == 0) {
      return false;
    } else {
      seats[row][col] = 0;
      return true;
    }
  }

  public static boolean pickPrice(int seats[][], int price) {

    for (int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[0].length; j++) {
        if (seats[i][j] == price) {
          seats[i][j] = 0;
          return true;
        }
      }
    }
    return false;
  }

}
