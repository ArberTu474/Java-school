// Ndërtoni një program që gjeneron 20 numra rasti hedhje zari në një tabelë dhe afishon vlerat e
// zarit duke vendosur në thonjëza vetëm sekuencën më të gjatë.
// 1 2 5 5 3 1 2 4 3 (2 2 2 2) 3 6 5 5 6 3 1

// Nëse ndodhet më shumë se një sekuencë me gjatësi maksimale, të vendoset në kllapa vetëm
// sekuenca e parë.

// import java.util.Arrays;
import java.util.Random;

public class Usht11 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] diceRolls = new int[20];
    for (int i = 0; i < diceRolls.length; i++) {
      diceRolls[i] = random.nextInt(6 - 1 + 1) + 1;
    }

    int[] runsStartIndexes = new int[diceRolls.length / 2];
    int[] runsLength = new int[diceRolls.length / 2];

    int runsCount = 0;

    System.out.println("All runs: ");
    boolean isRun = false;
    for (int i = 0; i < diceRolls.length - 1; i++) {
      if (isRun) {
        if (diceRolls[i] != diceRolls[i - 1]) {
          runsLength[runsCount] = i - runsStartIndexes[runsCount];
          runsCount++;
          isRun = false;
        }

      } else {
        if (diceRolls[i] == diceRolls[i + 1]) {
          runsStartIndexes[runsCount] = i;
          isRun = true;
        }
      }
      System.out.print(diceRolls[i] + " ");
    }

    System.out.println();
    if (isRun) {
      runsLength[runsCount] = diceRolls.length - 1 - runsStartIndexes[runsCount];

    }

    System.out.println();

    int largestRunStartIndex = maxValueIndex(runsLength, runsCount);

    for (int i = 0; i < diceRolls.length; i++) {
      if (i == runsStartIndexes[largestRunStartIndex]) {
        System.out.print("(");
      } else if (i == runsStartIndexes[largestRunStartIndex] + runsLength[largestRunStartIndex]) {
        System.out.print("\b) ");

      }
      System.out.print(diceRolls[i] + " ");
    }
    System.out.println();

    // System.out.println(Arrays.toString(runsStartIndexes));
    // System.out.println(Arrays.toString(runsLength));
  }

  public static int maxValueIndex(int[] array, int size) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < size; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    for (int i = 0; i < size; i++) {
      if (max == array[i]) {
        return i;
      }
    }
    return 0;
  }
}
