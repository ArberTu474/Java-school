import java.util.Scanner;

public class Usht9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your string: ");
    String string = scanner.next();

    System.out.println("String is palindorme: " + isPalindrome(string));

    scanner.close();
  }

  public static boolean isPalindrome(String str) {
    if (str.length() <= 1) {
      return true;
    }

    if (str.charAt(0) != str.charAt(str.length() - 1)) {
      return false;
    }

    return isPalindrome(str.substring(1, str.length() - 1));
  }
}
