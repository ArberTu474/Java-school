// 8. Ndërtoni një program që lexon një fjalë nga përdoruesi dhe më pas afishon fjalën mbrapsht.
// Përshembull nëse përdoruesi jep fjalën Harry programi do të afishojë yrraH.

import java.util.Scanner;

public class Usht8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your string: ");
    String input = scanner.next();

    StringBuilder word = new StringBuilder(input);

    System.out.println(word.reverse());

    scanner.close();
  }
}
