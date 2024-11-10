// Ndërtoni një metodë statike e cila kthen numrin e zanoreve në një string str.

import java.util.Scanner;

public class Usht5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your string: ");
    String input = scanner.nextLine();
    System.out.println("Numri i zanoreve: " + vowelsCount(input));

    scanner.close();
  }

  public static int vowelsCount(String string) {
    String vowels = "aeëiouy";
    int numberOfVowels = 0;
    for (int i = 0; i < string.length(); i++) {
      if (vowels.contains(Character.toString(string.charAt(i)).toLowerCase())) {
        numberOfVowels++;
      }
    }

    return numberOfVowels;
  }
}
