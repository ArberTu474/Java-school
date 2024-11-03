// 10. Numrat Fibonaci përcaktohen sipas sekuencës
// F1 = 1
// F2 = 1
// Fn = fn-1 + fn-2
// Ndërtoni një program që merr nga përdoruesi një numër n dhe afishon n numrat e Fibonacit duke
// përdorur algoritmin e mësipërm.

import java.util.Scanner;

public class Usht10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many numbers do you want o display: ");
    int n = scanner.nextInt();

    int a = 0;
    int b = 1;

    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      
      int c = a + b;
      a = b;
      b = c;
    }

    System.out.println();
    scanner.close();
  }
}
