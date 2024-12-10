import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

  @Test
  public void testDriveMoreThanTheTank() {
    Car myCar = new Car(50);
    myCar.addGaz(50);
    myCar.drive(6000);

    assertEquals(0, myCar.getGazLevel(), 0.001);
  }

  @Test
  public void testDriving() {
    Car myCar = new Car(1);
    myCar.addGaz(100);
    myCar.drive(1);

    System.out.println(myCar.getGazLevel());

    assertEquals(99, myCar.getGazLevel(), 0.001);
  }
}
