// 3. Shkruani një program që lexon një input si string dhe afishon
// a. Vetëm shkronjat e mëdha në një string. (Përdorni metodën isUpperCase)

import java.util.Scanner;

public class Usht3a {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your input: ");
    String input = scanner.next();

    for (int i = 0; i < input.length(); i++) {
      if (Character.isUpperCase(input.charAt(i))) {
        System.out.println(input.charAt(i));
      }
    }

    scanner.close();
  }
}
