// 4. Ndërtoni një program që lexon numra dhjetorë nga përdoruesi dhe më pas i afishon përdoruesit
// mesataren dhe vlerën më të vogël dhe më të madhe.

import java.util.Scanner;

public class Usht4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many numbers do you want to add: ");
    int count = scanner.nextInt();

    double max = Double.MIN_VALUE;
    double min = Double.MAX_VALUE;

    double sum = 0.0;
    double currentValue;

    for (int i = 0; i < count; i++) {
      System.out.print("Enter your number: ");
      currentValue = scanner.nextDouble();
      sum += currentValue;

      if (currentValue > max) {
        max = currentValue;
      }
      if (currentValue < min) {
        min = currentValue;
      }
    }

    System.out.printf("Sum:\t%.2f\n", sum);
    System.out.printf("Max:\t%.2f\n", max);
    System.out.printf("Min:\t%.2f\n", min);

    scanner.close();
  }
}
