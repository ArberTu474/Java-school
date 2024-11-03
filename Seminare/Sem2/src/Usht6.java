// a) Shkruani një program i cili pasi merr dy numra nga përdoruesi afishon shumën, diferencën,
// prodhimin, mesataren, vlerën absolute, maksimumin dhe minimumin midis tyre.
// b) Modifikoni ushtrimin e mësipërm duke formatuar outputin si më poshtë:
// Sum: 45
// Difference: -5
// Product: 500
// Average: 22.50
// Distance: 5
// Maximum: 25
// Minimum: 20

import java.util.Scanner;

public class Usht6 {
  public static void main(String[] args) {
    System.out.print("Enter your first number: ");

    Scanner scanner = new Scanner(System.in);
    double num1 = scanner.nextDouble();

    System.out.print("Enter your second number: ");
    double num2 = scanner.nextDouble();

    System.err.printf("Sum:\t\t%5.2f\n", num1 + num2);
    System.out.printf("Difference:\t%5.2f\n", num1 - num2);
    System.out.printf("Product:\t%5.2f\n", num1 * num2);
    System.out.printf("Average:\t%5.2f\n", (num1 + num2) / 2);
    System.out.printf("Distance:\t%5.2f\n", Math.abs(num1 - num2));
    System.out.printf("Maximum:\t%5.2f\n", Math.max(num1, num2));
    System.out.printf("Minimum:\t%5.2f\n", Math.min(num1, num2));

    String hello = scanner.next();
    System.out.println(hello);

    scanner.close();
  }
}
