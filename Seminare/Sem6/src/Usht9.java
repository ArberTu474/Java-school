// Ndërtoni një program që gjeneron një sekuencë prej 20 numra rasti hedhjesh zari dhe afishon
// vlerat duke vendosur në kllapa numrat që përsëriten si më poshtë:
// 1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1.

// Përdorni pseudokodin e mëposhtëm:
// inRun = false
// For each valid index i in the array
// If inRun
// 		If values[i] is different from the preceding value
// 			Print ).
// 			inRun = false
//       If not inRun
// 		If values[i] is the same as the following value
// 			Print (.
// 			inRun = true
// Print values[i].
// If inRun, print ).

import java.util.Random;

public class Usht9 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] diceRolls = new int[20];
    for (int i = 0; i < diceRolls.length; i++) {
      diceRolls[i] = random.nextInt(6 - 1 + 1) + 1;
    }

    boolean isRun = false;
    for (int i = 0; i < diceRolls.length - 1; i++) {
      if (isRun) {
        if (diceRolls[i] != diceRolls[i - 1]) {
          System.out.print("\b) ");
          isRun = false;
        }

      } else {
        if (diceRolls[i] == diceRolls[i + 1]) {
          System.out.print("(");
          isRun = true;
        }
      }

      System.out.print(diceRolls[i] + " ");
    }
    if (isRun) {
      System.out.print("\b)");
    }

    System.out.println();
  }

}
