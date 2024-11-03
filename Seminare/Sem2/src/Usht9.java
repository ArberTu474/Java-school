// Ndërtoni një program që lexon nga përdoruesi një numër midis 1,000 dhe 999,999 ku përdoruesi
// në input vendos presje. Më pas programi duhet të afishojë numrin pa presje për shembull:
// Ju lutemi vendosni një numër midis 1,000 dhe 999,999: 48,548
// 48548

import java.util.Scanner;

public class Usht9 {
  public static void main(String[] args) {

    System.out.print("Enter your number using a comma bewtween 1000-999999: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    scanner.close();

    input = input.replace(",", ".");

    double number = Double.parseDouble(input);
    if (number < 100 && number > 999999) {
      System.out.println("Number out of range 1000-999999.");
    } else {
      input = input.replace(".", "");
      System.out.println(input);
    }
  }
}
