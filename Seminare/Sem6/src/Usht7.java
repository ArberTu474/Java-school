// Write a method
// public static boolean sameSet(int[] a, int[] b)
// that checks whether two arrays have the same elements in some order, ignoring
// duplicates. For example, the two arrays
// 1 4 9 16 9 7 4 9 11
// and
// 11 11 7 9 16 4 1
// would be considered identical. You will probably need one or more helper methods.

import java.util.Arrays;

public class Usht7 {

  public static void main(String[] args) {
    int[] set1 = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
    int[] set2 = { 11, 11, 7, 9, 16, 4, 1 };

    System.out.println("Same set: " + sameSet(set1, set2));
  }

  public static boolean sameSet(int[] a, int[] b) {
    int[] uniqieA = getUniqueElements(a);
    int[] uniqieB = getUniqueElements(b);

    System.out.println(Arrays.toString(uniqieA));
    System.out.println(Arrays.toString(uniqieB));

    for (int i = 0; i < uniqieA.length; i++) {
      boolean isFound = false;
      for (int j = 0; j < uniqieB.length; j++) {
        if (uniqieA[i] == uniqieB[j]) {
          isFound = true;
          break;
        }
      }

      if (!isFound) {
        return false;
      }
    }
    return true;
  }

  public static int[] getUniqueElements(int[] array) {
    int[] temp = new int[array.length];
    int count = 0;

    for (int i = 0; i < array.length; i++) {
      boolean isUnique = true;
      for (int j = 0; j < count; j++) {
        if (array[i] == temp[j]) {
          isUnique = false;
          break;
        }
      }

      if (isUnique) {
        temp[count] = array[i];
        count++;
      }
    }

    return Arrays.copyOfRange(temp, 0, count);
  }

}
