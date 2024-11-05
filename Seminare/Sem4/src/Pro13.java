// In the 17th century, the discipline of probability theory got its start when a gambler
// asked a mathematician friend to explain some observations about dice games. Why
// did he, on average, win a bet that at least one six would appear when rolling a die
// four times? And why did he seem to lose a similar bet, getting at least one double-six
// when rolling a pair of dice 24 times?
// Nowadays, it seems astounding that any person would roll a pair of dice 24 times in
// a row, and then repeat that many times over. Let’s do that experiment on a computer
// instead. Simulate each game a million times and print out the wins and losses,
// assuming each bet was for $1.

import java.util.Random;

public class Pro13 {
  public static void main(String[] args) {
    final int NUMBER_OF_SIMUTATES = 1_000_000;

    int winsGame1 = 0;
    int lossesGame1 = 0;

    int winsGame2 = 0;
    int lossesGame2 = 0;

    Random random = new Random();

    // Game 1. Roll the die 4 ties and at least get 1 six
    for (int i = 0; i < NUMBER_OF_SIMUTATES; i++) {
      boolean won = false;
      for (int j = 0; j < 4; j++) {
        int roll = random.nextInt(6) + 1;

        if (roll == 6) {
          won = true;
          break;
        }
      }

      if (won) {
        winsGame1++;
      } else {
        lossesGame1++;
      }
    }

    // Game 2. Roll at least 1 double six in 24 rolls
    for (int i = 0; i < NUMBER_OF_SIMUTATES; i++) {
      boolean won = false;
      for (int j = 0; j < 24; j++) {
        int roll1 = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;

        if (roll1 == 6 && roll2 == 6) {
          won = true;
          break;
        }
      }

      if (won) {
        winsGame2++;
      } else {
        lossesGame2++;
      }
    }

    System.out.println("==========Game 1==========");
    System.out.printf("Number of wins: %d (%.3f%%)\n", winsGame1, (double) winsGame1 / NUMBER_OF_SIMUTATES * 100);
    System.out.printf("Number of losses: %d (%.3f%%)\n", lossesGame1, (double) lossesGame1 / NUMBER_OF_SIMUTATES * 100);
    System.out.println();
    System.out.println("==========Game 2==========");
    System.out.printf("Number of wins: %d (%.3f%%)\n", winsGame2, (double) winsGame2 / NUMBER_OF_SIMUTATES * 100);
    System.out.printf("Number of losses: %d (%.3f%%)\n", lossesGame2, (double) lossesGame2 / NUMBER_OF_SIMUTATES * 100);

  }
}
