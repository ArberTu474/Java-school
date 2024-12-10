// 7 .Ndërtoni një program i cili pasi merr një fjalë nga përdoruesi përcakton nëse fjala është
// palindrome ose jo.

import java.util.Scanner;

public class Usht7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your string: ");
    String input = scanner.next().trim();

    StringBuilder palindrom = new StringBuilder(input);

    // palindrom.append(input);
    StringBuilder reverse = palindrom.reverse();

    if (input.equals(reverse.toString())) {
      System.out.println("Kemi palindrom");
    } else {
      System.out.println("Nuk kemi palindrome");
    }

    scanner.close();
  }
}
