// Ndërtoni një program i cili lexon tre numra me presje të lëvizshme dhe më pas afishon më të
// madhin prej tyre. Për shembull:
// Ju lutem jepni tre numra: 4 9 2.5
// Numri më i madh është: 9

import java.util.Scanner;

public class Usht6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Number 1: ");
    double number1 = scanner.nextDouble();

    System.out.print("Number 2: ");
    double number2 = scanner.nextDouble();

    System.out.print("Number 3: ");
    double number3 = scanner.nextDouble();

    double max = Math.max(number1, Math.max(number2, number3));

    System.out.println("Numri me i madh eshte: " + max);

    scanner.close();
  }
}
