// Ndërtoni një program që kërkon nga përdoruesi rrezen dhe më pas afishon:
// a. sipërfaqen e rrethit me atë rreze
// b. Vëllimin dhe sipërfaqen e sferës me atë rreze

import java.util.Scanner;

public class Usht7 {
  public static void main(String[] args) {
    System.out.print("Enter the radius of the circle: ");
    Scanner scanner = new Scanner(System.in);

    double radius = scanner.nextDouble();
    scanner.close();

    System.out.println();
    System.out.printf("The area of the circle is: %.2f cm2\n", Math.PI * radius * radius);
    System.out.printf("The volume of the sphere is: %.2f cm3\n", 4.0 / 3 * Math.PI * Math.pow(radius, 3));
  }
}
