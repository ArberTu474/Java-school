// Ndërtoni një program i cili lexon nga përdoruesi tre numra dhe afishon dy çifte nëse gjenden dy
// cifte që përputhen dhe jo dy çifte në të kundërt. Për shembull:

// 1 2 2 1 Dy çifte
// 1 2 2 3 Jo çifte
// 2 2 2 2 Dy çifte

import java.util.Scanner;

public class Usht4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Number 1: ");
    int number1 = scanner.nextInt();

    System.out.print("Number 2: ");
    int number2 = scanner.nextInt();

    System.out.print("Number 3: ");
    int number3 = scanner.nextInt();

    System.out.print("Number 4: ");
    int number4 = scanner.nextInt();

    if ((number1 == number2 && number3 == number4) ||
        (number1 == number3 && number2 == number4) ||
        (number1 == number4 && number2 == number3)) {
      System.out.println("2 cifte");
    } else {
      System.out.println("jo 2 cifte");
    }

    scanner.close();
  }
}
