// Ndërtoni një metodë rekursive statike reverse e cila merr si parametër një string dhe kthen
// mbrapsht stringun. Për të kthyer mbrapsht një string duhet të fillohet në karakterin e dytë, dhe më
// pas të shtosh të parin në fund. Për shembull për të kthyer mbrapsht fjalën flow, së pari kthejmë
// mbrapsht low në wol dhe më pas shtojmë f në fund.

import java.util.Scanner;

public class Usht7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your string: ");
    String string = scanner.next();

    System.out.println("Reverse: " + reverseString(string));

    scanner.close();
  }

  public static String reverseString(String str) {
    if (str == null || str.length() <= 1) {
      return str;
    }
    return reverseString(str.substring(1)) + str.charAt(0);
  }
}
