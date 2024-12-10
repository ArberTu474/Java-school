// Ndërtoni metodat e mëposhtme të cilat marrin si paramentër një tabelë dhe :

// b. Zëvendëson elementin e parë me të fundit
// c. Sposton të gjithë elementët në të djathtë, ndërsa elementin e fundit e vendos në fillim si
// për shembull tabela 1 4 9 16 25 do të transformohet në 25 1 4 9 16 25
// d. Heq elementin e mesit nëse numri i elementëve të tabelës është tek ose dy elementët e
// mesit nëse tabela ka numër çift elementësh
// e. Kthen numrin e dytë më të madh në tabelë
// f. Kthen true nëse tabela është e renditur në rendin rritës
// g. Kthen true nëse tabela përban dy elementë fqinjë të dublikuar
// h. Kthen true nëse tabela përmban elementë të dublikuar

import java.util.Arrays;

public class Usht3 {
  public static void main(String[] args) {
    final int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    System.out.println(Arrays.toString(array));
    System.out.println("Swap fist with last: " + Arrays.toString(swapFirstLast(array)));
    System.out.println("Shift to the right: " + Arrays.toString(shiftToRight(array)));
    System.out.println("Remove the middle element: " + Arrays.toString(removeMiddleElement(array)));
    System.out.println("Second largest: " + secondLargest(array));
    System.out.println("Is sorted: " + isSorted(array));
    System.out.println("Has dublicate elements side by side: " + hasDublicateNumbers(array));
    System.out.println("Has dublicate elements : " + hasDublicateElements(array));
  }

  public static int[] swapFirstLast(int[] array) {
    int[] copy = Arrays.copyOf(array, array.length);

    int temp = copy[0];
    copy[0] = copy[copy.length - 1];
    copy[copy.length - 1] = temp;
    return copy;
  }

  public static int[] shiftToRight(int[] array) {
    int[] copy = Arrays.copyOf(array, array.length);

    int temp = copy[copy.length - 1];

    for (int i = copy.length - 2; i >= 0; i--) {
      copy[i + 1] = copy[i];
    }

    copy[0] = temp;

    return copy;
  }

  public static int[] removeMiddleElement(int[] array) {
    int[] copy = Arrays.copyOf(array, array.length);

    if (copy.length % 2 == 1) {
      for (int i = copy.length / 2; i < copy.length - 1; i++) {
        copy[i] = copy[i + 1];
      }
      return Arrays.copyOfRange(copy, 0, copy.length - 1);

    } else {
      for (int i = copy.length / 2 - 1; i < copy.length - 2; i++) {
        copy[i] = copy[i + 2];
      }
      return Arrays.copyOfRange(copy, 0, copy.length - 2);
    }
  }

  public static int secondLargest(int[] array) {

    if (array == null || array.length < 2) {
      throw new IllegalArgumentException("Array must have at least two elements");
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : array) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num != largest) {
        secondLargest = num;
      }
    }

    if (secondLargest == Integer.MIN_VALUE) {
      throw new IllegalArgumentException("Array must have at least two distinct elements");
    }

    return secondLargest;
  }

  public static boolean isSorted(int[] array) {

    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] >= array[i + 1]) {
        return false;
      }
    }

    return true;
  }

  public static boolean hasDublicateNumbers(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] == array[i + 1]) {
        return true;

      }
    }
    return false;
  }

  public static boolean hasDublicateElements(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length - 1; j++) {
        if (array[i] == array[j]) {
          return true;
        }
      }
    }

    return false;
  }
}
