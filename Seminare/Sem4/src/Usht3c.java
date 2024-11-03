// c. Numrin e shifrave në një string. (Përdorni metodën isDigit()).

import java.util.Scanner;

public class Usht3c {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter you string: ");
    String input = scanner.next();

    int count = 0;
    for (int i = 0; i < input.length(); i++) {
      if (Character.isDigit(input.charAt(i))) {
        count++;
      }
    }

    System.out.println("There are " + count + " numbers in this string.");
    scanner.close();
  }
}
