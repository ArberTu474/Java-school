// Following Section 4.9, develop a program that reads a string and removes all dupli­
// cates. For example, if the input is Mississippi, print Misp. Start small and just print the
// first letter. Then print the first letter and true if the letter is not duplicated elsewhere,
// false otherwise. (Look for it in the remaining string, by using the substring and
// indexOf methods.) Next, do the same for the first two letters, and print out for each
// letter whether or not they occur in the substring before and after the letter. Try with
// a string like oops. Extend to all characters in the string. Have a look at the output
// when the input is Mississippi. Which characters should you not report? At this time,
// you should have gathered enough experience that you can complete the program.

import java.util.Scanner;

public class Pro7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your string: ");
    String input = scanner.next();

    String result = "";

    for (int i = 0; i < input.length(); i++) {
      if (!result.contains(Character.toString(input.charAt(i)))) {
        result += input.charAt(i);
      }
    }

    System.out.println(result);

    scanner.close();
  }
}
