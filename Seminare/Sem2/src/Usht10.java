// Shkruani një program që lexon një numër të plotë dhe e ndan atë në një sekuencë shifrash
// individuale. Për shembull inputi 16384 shfaqet si më poshtë:

// 1 6 3 8 4

// Ju mund të supozoni që inputi nuk ka më shumë se pesë shifra dhe nuk është negativ.

import java.util.Scanner;

public class Usht10 {
  public static void main(String[] args) {

    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();

    StringBuilder reverseString = new StringBuilder(input);
    reverseString.reverse();

    for (int i = 0; i < input.length(); i++) {
      System.out.print(reverseString.charAt(i) + " ");
    }
    System.out.println();

    scanner.close();
  }
}
