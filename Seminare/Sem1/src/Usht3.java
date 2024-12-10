// Ndërtoni një program që afishon emrin tuaj brenda një katrori. Përdorni karakteret si
// |, - dhe + për të formuar katrorin.

import java.util.Scanner;

public class Usht3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    scanner.close();

    // Print the top border
    System.out.print("+");
    for (int i = 0; i < name.length() + 2; i++) {
      System.err.print("-");
    }
    System.out.print("+\n");

    // Print the Name
    System.out.println("| " + name + " |");

    // Print the bottom border
    System.out.print("+");
    for (int i = 0; i < name.length() + 2; i++) {
      System.err.print("-");
    }
    System.out.print("+\n");
  }
}
