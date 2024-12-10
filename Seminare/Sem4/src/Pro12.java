// The Buffon Needle Experiment. The follow­ing experiment was devised by Comte
// Georges-Louis Leclerc de Buffon (1707–1788), a French naturalist. A needle of
// length 1 inch is dropped onto paper that is ruled with lines 2 inches apart. If the
// needle drops onto a line, we count it as a hit. (See Figure 9.) Buffon discovered that
// the quotient tries/hits approximates π.
// For the Buffon needle experiment, you must generate two random numbers: one to
// describe the starting position and one to describe the angle of the needle with the
// x-axis. Then you need to test whether the needle touches a grid line.
// Generate the lower point of the needle. Its x-coordinate is irrelevant, and you may
// assume its y-coordi­nate ylow to be any random number between 0 and 2. The angle π
// between the needle and the x-axis can be any value between 0 degrees and 180
// degrees (π radians). The upper end of the needle has y-coordinate
// yhigh = ylow + sin α
// The needle is a hit if yhigh is at least 2, as shown in Figure 10. Stop after 10,000 tries
// and print the quotient tries/hits. (This program is not suitable for computing the
// value of π. You need π in the computation of the angle.)

import java.util.Random;

public class Pro12 {
  public static void main(String[] args) {
    final long TRIES = 1_000_000_000_000L;

    Random random = new Random();

    int hits = 0;

    for (int i = 0; i < TRIES; i++) {
      double yLow = random.nextDouble() * 2;
      double angle = random.nextDouble() * 180;

      double yHigh = yLow + Math.sin(Math.toRadians(angle));
      if (yHigh >= 2) {
        hits++;
      }

    }
    System.out.println("PI result: " + ((double) TRIES / hits));

  }
}
