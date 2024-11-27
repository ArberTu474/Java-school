// Implement a class Car with the following properties. A car has a cer­tain fuel effi-
// ciency (measured in miles/gallon) and a certain amount of fuel in the gas tank.
// The efficiency is specified in the constructor, and the initial fuel level is 0. 
// Supply amethod drive that simulates driving the car for a certain distance, reducing the fuel
// level in the gas tank, and methods getGasLevel, to return the current fuel level, and
// addGas, to tank up. Sample usage:
// Car myHybrid = new Car(50); // 50 miles per gallon
// myHybrid.addGas(20); // Tank 20 gallons
// myHybrid.drive(100); // Drive 100 miles
// System.out.println(myHybrid.getGasLevel()); // Print fuel remaining

public class Car {
  private double fuelEfficiency;
  private double fueelLevel;

  public Car(double fuelEfficiency) {
    this.fuelEfficiency = fuelEfficiency;
    this.fueelLevel = 0;
  }

  /**
   * Simulates the distance driven by a car and the fuel used
   * 
   * @param miles miles driven by the car
   */
  public void drive(double miles) {
    if (miles / fuelEfficiency > fueelLevel) {
      fueelLevel = 0;
    } else {
      fueelLevel -= (miles / fuelEfficiency);
    }
  }

  public double getGazLevel() {
    return fueelLevel;
  }

  /**
   * Adds gaz to the car
   * 
   * @param fuel amount of fuel that you want to add to the tank
   */
  public void addGaz(double fuel) {
    fueelLevel += fuel;
  }

  @Override
  public String toString() {
    return "Car [fuelEfficiency=" + fuelEfficiency + ", fueelLevel=" + fueelLevel + "]";
  }
  

}
