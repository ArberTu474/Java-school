// 13. Ndërtoni një program që lexon një numër të plotë nga përdoruesi dhe duke përdorur yjet, shfaq
// një romb. Për shembull nëse përdoruesi vendos numrin 4, programi do të afishojë rombin si më
// poshtë:
//       *
//     * * *
//   * * * * *
// * * * * * * *
//   * * * * * 
//     * * * 
//       *

import java.util.Scanner;

public class Usht13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number: ");
    int n = scanner.nextInt();

    for (int i = 1; i < n * 2; i++) {
      for (int j = 1; j < n * 2; j++) {
        if (j <= n - i || j >= n + i || (i > n && j < i + 1 - n) ||(i > n && j > 2 * n - (i - n + 1))) {
          System.out.print("  ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
