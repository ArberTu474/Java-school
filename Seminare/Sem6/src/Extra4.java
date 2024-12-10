// In this assignment, you will model the game of Bulgarian Solitaire. The game starts
// with 45 cards. (They need not be playing cards. Unmarked index cards work just as
// well.) Randomly divide them into some number of piles of random size. For exam­
// ple, you might start with piles of size 20, 5, 1, 9, and 10. In each round, you take one
// card from each pile, forming a new pile with these cards. For example, the sample
// starting configuration would be transformed into piles of size 19, 4, 8, 9, and 5. The
// solitaire is over when the piles have size 1, 2, 3, 4, 5, 6, 7, 8, and 9, in some order. (It
// can be shown that you always end up with such a configuration.)
// In your program, produce a random starting configuration and print it. Then keep
// applying the soli­taire step and print the result. Stop when the solitaire final configu-
// ration is reached.

import java.util.Arrays;
import java.util.Random;

public class Extra4 {
  public static void main(String[] args) {
    final int totalCards = 45;

    int[] piles = new int[totalCards];
    piles = generateRandomPiles(totalCards);
    Arrays.sort(piles);

    System.out.println(Arrays.toString(piles));
    performSolitaire(piles);

  }

  public static void performSolitaire(int[] piles) {
    // remove 1 card form each pile
    int removedCards = 0;

    for (int i = 0; i < piles.length; i++) {
      if (piles[i] > 0) {
        piles[i] -= 1;
        removedCards++;
      }
    }

    while (contains(piles, 0)) {
      int pileIndex = firstInstanceIndex(piles, 0);
      System.out.println("i" + pileIndex);
      shiftLeft(piles, pileIndex);
    }

    System.out.println(removedCards);
    System.out.println(Arrays.toString(piles));
  }

  public static int firstInstanceIndex(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      }
    }
    return -1;
  }

  public static void shiftLeft(int[] array, int index) {
    for (int i = index; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
  }

  public static int[] generateRandomPiles(int cards) {
    int numberOfPiles = randomNumber(1, cards);
    int[] piles = new int[numberOfPiles + 1];

    for (int i = 0; i < numberOfPiles; i++) {
      piles[i] = 1;
    }

    // seperate the cards into their piles
    for (int i = 0; i < cards - numberOfPiles; i++) {
      piles[randomNumber(0, numberOfPiles - 1)] += 1;

    }
    return piles;
  }

  public static boolean contains(int[] array, int value) {
    for (int element : array) {
      if (element == value) {
        return true;
      }
    }
    return false;
  }

  public static int randomNumber(int min, int max) {
    Random random = new Random();

    return random.nextInt(max - min + 1) + min;
  }
}
