// 2. Shkruani një program që lexon një sekuencë numrash të plotë dhe afishon:
// b. Vlerat që përsëriten për shembull nëse inputi është 1 3 3 4 5 5 6 6 6 2, programi do të
// afishojë 3 5 6

import java.util.Scanner;

public class Usht2b {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your numbers: ");
    String input = scanner.nextLine().replaceAll(" ", "");

    String foundDuplicates = "";

    for (int i = 0; i < input.length(); i++) {
      for (int j = 0; j < input.length(); j++) {
        if (input.charAt(i) == input.charAt(j) && i != j
            && !foundDuplicates.contains(Character.toString(input.charAt(j)))) {
          System.out.print(input.charAt(i) + " ");
          foundDuplicates += input.charAt(i);
          break;
        }
      }
    }
    System.out.println();

    scanner.close();
  }
}
