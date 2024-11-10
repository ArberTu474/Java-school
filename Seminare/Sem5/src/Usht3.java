// Ndërtoni një metodë statike që merr si parametër një String dhe kthen një String që përmban
// karakterin e mesit nëse stringu ka karaktere çift dhe kthen të dy karakteret e mesit nëse stringu ka
// karaktere tek.

import java.util.Scanner;

public class Usht3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your string: ");
    String input = scanner.next();

    System.out.println(middleChar(input));
    scanner.close();
  }

  public static String middleChar(String string) {
    if (string.length() % 2 == 0) {

      return string.substring((string.length() / 2) - 1, (string.length() / 2) + 1);
    }
    return Character.toString(string.charAt(string.length() / 2));
  }
}
