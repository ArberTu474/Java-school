// b. Stringun ku të gjitha zanoret janë zëvendësuar nga _ (underscore).

import java.util.Scanner;

public class Usht3b {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your string: ");
    String input = scanner.next().toLowerCase();

    String zanore = "aeëiouy";

    for (int i = 0; i < input.length(); i++) {
      if (zanore.contains(Character.toString(input.charAt(i)))) {
        input = input.replace(Character.toString(input.charAt(i)), "_");
      }
    }

    System.out.println(input);
    scanner.close();
  }
}
