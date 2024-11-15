// Ndërtoni një program që lexon një sekuencë me vlera nga përdoruesi sëbashku me shtetin
// përkatës dhe më pas afishoni një grafik të numrit të vlerave të marra nga përdoruesi duke përdorur
// yjet. Output-i duhet të afishohet si më poshtë:

import java.util.Scanner;

public class Usht14 {
  public static void main(String[] args) {
    // System.out.printf("%" + 20 + "s%n", "hello");

    Scanner scanner = new Scanner(System.in);
    System.out.print("How many states do you want to incllude: ");
    int inputNumber = scanner.nextInt();

    String[] names = new String[inputNumber];
    int[] population = new int[inputNumber];

    for (int i = 0; i < inputNumber; i++) {
      System.out.print("State name: ");
      names[i] = scanner.next();
      System.out.print("Population: ");
      population[i] = scanner.nextInt();
      System.out.println();
    }

    final int whiteSpaceWidht = maxNameWidth(names);

    for (int i = 0; i < inputNumber; i++) {
      System.out.printf("%" + whiteSpaceWidht + "s: ", names[i]);
      printStars(population[i]);
      System.out.println();
    }

    scanner.close();
  }

  public static int maxNameWidth(String[] array) {
    int maxWidht = Integer.MIN_VALUE;

    for (String string : array) {
      if (string.length() > maxWidht) {
        maxWidht = string.length();
      }
    }

    return maxWidht;
  }

  public static void printStars(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("*");
    }
  }
}
