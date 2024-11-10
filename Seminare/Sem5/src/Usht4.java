// Ndërtoni një metodë statike e merr si parametër një string str dhe një numër n dhe kthen stringun
// që përsëritet n herë.

import java.util.Scanner;

public class Usht4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();

    System.out.print("How many times do you want to repeat your string: ");
    int repeat = scanner.nextInt();
    System.out.println(repeat(inputString, repeat));
    scanner.close();
  }

  public static String repeat(String string, int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
      result += string;
    }
    return result;
  }
}
