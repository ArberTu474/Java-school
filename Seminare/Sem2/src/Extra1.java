// In this project, you will perform calculations with triangles. A triangle is defined by
// the x- and y-coordinates of its three corner points.
// Your job is to compute the following properties of a given triangle:
// • the lengths of all sides
// • the perimeter
// • the angles at all corners
// • the area

// Supply a program that prompts a user for the corner point coordinates and produces
// a nicely formatted table of the triangle properties.

public class Extra1 {
  public static void main(String[] args) {
    // Points of the corners of the triangle are named with ABC

    double Ax = 1;
    double Ay = 1;

    double Bx = 4;
    double By = 2;

    double Cx = 2;
    double Cy = 3;

    double a = roundOff(pointsDistance(Bx, By, Cx, Cy));
    double b = roundOff(pointsDistance(Cx, Cy, Ax, Ay));
    double c = roundOff(pointsDistance(Ax, Ay, Bx, By));

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c);

    System.err.println("\n=====================\n");

    double trianglePerimeter = a + b + c;

    double angleA = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
    double angleB = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
    double angleC = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));

    System.out.println("A: " + roundOff(angleA));
    System.out.println("B: " + roundOff(angleB));
    System.out.println("C: " + roundOff(angleC));

    System.err.println("\n=====================\n");

    System.out.println("Area: " + roundOff(triangleArea(b, c, angleA)));

    System.err.println("\n=====================\n");

    System.out.println("Perimeter: " + trianglePerimeter);
  }

  public static double pointsDistance(double ax, double ay, double bx, double by) {

    double distance = Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
    return distance;
  }

  public static double triangleArea(double a, double b, double angleC) {
    return 0.5 * a * b * (Math.sin(Math.toRadians(angleC)));
  }

  public static double roundOff(double a) {
    return (double) Math.round(a * 1000) / 1000;
  }

}
