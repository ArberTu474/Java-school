// Përdoni rekursionin për të implementuar një metodë public static boolean find(String str, String
// match) që teston nëse stringu match ndodhet në string.
// boolean b = find("Mississippi", "sip"); / b do të ketë vlerën true
// Nëse stringu fillon me match, atëherë programi ka përfunduar. Nëse jo, filloni përsëri kontrollonin
// duke hequr karakterin e parë në fjalë.

import java.util.Scanner;

public class Usht8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your string: ");
    String string = scanner.next();

    System.out.print("Enter your Substring: ");
    String subString = scanner.next();

    System.out.println("It is a sbstring: " + isSubstring(string, subString));

    scanner.close();
  }

  public static boolean isSubstring(String mainString, String subString) {
    if (mainString.length() < subString.length()) {
      return false;
    }

    if (mainString.substring(0, subString.length()).equals(subString)) {
      return true;
    }

    return isSubstring(mainString.substring(1), subString);
  }
}
