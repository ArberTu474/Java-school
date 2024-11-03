// 1. Shkruani një program që llogarit:
// a. Shumën e numrave çift midis a dhe b, ku a dhe b merren nga përdoruesi.
// b. Shumën e numrave tek të shifrave të dhëna nga përdoruesi. Për shembull nëse inputi është
// 32677, shuma e numrave do të ishte 3+7+7=17.

import java.util.Scanner;

public class Usht1b {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your number: ");
    String input = scanner.next();

    boolean error = false;
    int sum = 0;

    for (int i = 0; i < input.length(); i++) {
      if (!Character.isDigit(input.charAt(i))) {
        error = true;
        break;
      } else if (input.charAt(i) % 2 == 1) {
        sum += Character.getNumericValue(input.charAt(i));
      }
    }

    if (error) {
      System.out.println("Please enter a number.");
    } else {
      System.out.println("Sum is: " + sum);
    }

    scanner.close();
  }
}
