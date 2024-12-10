import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SodaCanTest {
  @Test
  public void canSurfaceAreaTest() {
    SodaCan can = new SodaCan(2, 2);
    assertEquals(50.27, can.getSurfaceArea(), 0.01);
  }

  @Test
  public void canVolumeTest() {
    SodaCan can = new SodaCan(2, 2);
    assertEquals(25.13, can.getVolume(), 0.01);
  }
}
