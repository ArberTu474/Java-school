// Ndërtoni metodat statike
// public static double cylinderVolume(double r, double h)
// public static double cylinderSurface(double r, double h)
// të cilat llogarisin vëllimin dhe sipërfaqen e cilindrit. Vendosini ato në një klasë dhe më pas shkruani
// programin i cili kërkon nga përdoruesi vlerat e r dhe të h, thërret metodat dhe më pas afishon
// rezultatin.

import java.util.Scanner;

public class Usht7 {
  public static void main(String[] args) {
    System.out.print("x\u00b2");
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the radius of the cylinder: ");
    double radius = scanner.nextDouble();
    System.out.print("Enter the height of the cylinder: ");
    double height = scanner.nextDouble();

    System.out.printf("Surface: %.2fcm%s\n", Cylinder.cylinderSurface(radius, height), '\u00b2');
    System.out.printf("Colume: %.2fcm%s\n", Cylinder.cylinderVolume(radius, height), '\u00b3');

    scanner.close();
  }
}
