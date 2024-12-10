// 11. Ndërtoni një program që kërkon nga përdoruesi një numër të plotë dhe më pas afishon të gjithë
// faktorët e tij. Për shembull nëse përdoruesi vendos numrin 150 programi do të afishojë

// 2
// 3
// 5
// 5

import java.util.Scanner;

public class Usht11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your number: ");
    int number = scanner.nextInt();

    while (number % 2 == 0) {
      System.out.println(2);
      number /= 2;
    }

    for (int i = 3; i <= Math.sqrt(number); i += 2) {
      while (number % i == 0) {
        System.out.println(i);
        number /= i;
      }
    }

    if (number > 2) {
      System.out.println(number);
    }

    scanner.close();
  }
}
