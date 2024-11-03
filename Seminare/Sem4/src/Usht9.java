// 9. Ndërtoni një program që lexon një fjalë dhe afishon të gjitha substringjet e fjalëve të renditura
// sipas gjatësisë. Për shembull nëse përdoruesi vendos fjalën “rum”, programi do të afishojë

// r
// u
// m
// ru
// um
// rum

import java.util.Scanner;

public class Usht9 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your string: ");
    String input = scanner.next();

    for (int i = 1; i <= input.length(); i++) {
      int j = 0;
      while (j + i <= input.length()) {

        System.out.println(input.substring(j, j + i));
        j++;
      }
    }

    scanner.close();
  }
}
