// Ndërtoni një program që lexon nga përdoruesi tre numra dhe kontrollon nëse numrat janë në
// rendin zbritës, rendin rritës, ose asnjëra nga alternativat.

import java.util.Scanner;

public class Usht3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Number 1: ");
    int number1 = scanner.nextInt();

    System.out.print("Number 2: ");
    int number2 = scanner.nextInt();

    System.out.print("Number 3: ");
    int number3 = scanner.nextInt();

    if (number1 > number2 && number2 > number3) {
      System.out.println("Numrat jane ne rendin zbrites");
    } else if (number1 < number2 && number2 < number3) {
      System.out.println("Numrat jane ne rendin rrites");
    } else {
      System.out.println("Numrat nuk jane ne nje rend te caktuar");
    }

    scanner.close();
  }
}
