import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LetterTest {

  @Test
  public void testLetter() {
    Letter letter = new Letter("Arber", "Ben");

    String test = "Dear Ben:\n\nHello there how are you?\nHope you are fine\nSee you!\n\nSincerely,\n\nArber";

    letter.addLine("Hello there how are you?");
    letter.addLine("Hope you are fine");
    letter.addLine("See you!");

    assertEquals(test, letter.getText());
  }
}
