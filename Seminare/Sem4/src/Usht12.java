// 12. Ndërtoni një program që kërkon nga përdoruesi një numër të plotë dhe afishon të gjithë numrat
// prim deri tek ai numër. Për shembull nëse përdoruesi vendos numrin 20, programi do të afishojë:

// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 19

import java.util.Scanner;

public class Usht12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your number: ");
    int number = scanner.nextInt();
    for (int i = 1; i <= number; i++) {
      if (isPrime(i)) {
        System.out.println(i + " ");
      }
    }

    scanner.close();
  }

  public static boolean isPrime(int num) {
    if (num <= 1)
      return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }
}
