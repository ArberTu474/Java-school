// Ndërtoni një program i cili mbush një array list me vlera nga përdoruesi. Përdoruesi gjithashtu jep
// dy indekse. Programi duhet të afishojë array listën duke hequr nga lista të gjithë elementët indeksi
// i të cilëve është midis indeksit më të vogël të dhënë nga përdoruesi deri tek indeksi më të madh.

import java.util.ArrayList;
import java.util.Scanner;

public class Usht5 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    Scanner scanner = new Scanner(System.in);

    int min;
    int max;
    System.out.println("Enter the min index: ");
    min = scanner.nextInt();
    System.out.println("Enter the max index: ");
    max = scanner.nextInt();

    System.out.println("Enter numbers (non-integer input to stop): ");

    while (scanner.hasNextInt()) {
      numbers.add(scanner.nextInt());
    }

    scanner.close();
    System.out.println("Original array:");
    System.out.println(numbers);

    for (int i = min; i <= max; i++) {
      numbers.remove(min);
    }

    System.out.println("Modified array:");
    System.out.println(numbers);
  }
}
