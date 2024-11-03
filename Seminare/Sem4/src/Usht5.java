// 5. Ndërtoni një program që lexon një fjalë nga përdoruesi dhe afishon numrin e zanoreve dhe
// karakteret e tij në një rresht të ri.

import java.util.Scanner;

public class Usht5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your string: ");
    String input = scanner.next().toLowerCase();

    String zanore = "aeëiouy";
    int count = 0;

    for (int i = 0; i < input.length(); i++) {
      if (zanore.contains(Character.toString(input.charAt(i)))) {
        count++;
      }
    }

    System.out.println(count + " zanore");
    System.out.println("String length: " + input.length());

    scanner.close();
  }
}
