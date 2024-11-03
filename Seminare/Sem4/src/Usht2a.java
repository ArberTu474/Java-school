// 2. Shkruani një program që lexon një sekuencë numrash të plotë dhe afishon:
// a. Shumën e numrave në seri si në shembullin e mëposhtëm
// Nëse inputi është 1 7 2 9 programi duhet të afishojë 1 8 10 19

import java.util.Scanner;

public class Usht2a {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a sequence of number: ");
    String input = scanner.nextLine().replaceAll(" ", "");

    int sum = 0;
    System.out.println("the sum is:");
    for (int i = 0; i < input.length(); i++) {
      sum += Character.getNumericValue(input.charAt(i));
      System.out.print(sum + " ");
    }
    System.out.println();

    scanner.close();
  }
}
