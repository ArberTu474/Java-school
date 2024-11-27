// Implement a class SodaCan with methods getSurfaceArea() and get­­Volume(). In the
// constructor, supply the height and radius of the can.

public class SodaCan {
  private double height;
  private double radius;

  public SodaCan(double height, double radius) {
    this.height = height;
    this.radius = radius;
  }

  public double getVolume() {
    return Math.PI * radius * radius * height;
  }

  public double getSurfaceArea() {
    return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
  }

}
