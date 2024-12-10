// Ndërtoni një program që llogarit shumën alternative të elementëve në tabelë. Për shembull nëse
// programi lexon elementët 1 4 9 16 9 atëhërë do të llogarisë vlerën 1 – 4 + 9 – 16 + 9.

import java.util.Scanner;

public class Usht5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int arraySize;
    System.out.print("How many numbers do you want to add: ");
    arraySize = scanner.nextInt();

    int[] numbers = new int[arraySize];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Number " + (i + 1) + ": ");
      numbers[i] = scanner.nextInt();
    }

    int sign = 1;
    int alterantiveSum = 0;
    for (int number : numbers) {
      alterantiveSum += (sign * number);
      sign *= -1;
    }

    System.out.println("Alterative Sum: " + alterantiveSum);

    scanner.close();
  }
}
