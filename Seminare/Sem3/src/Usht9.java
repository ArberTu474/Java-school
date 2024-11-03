// Ndërtoni një program që kërkon nga përdoruesi një karakter nga alfabeti dhe më pas afishon nëse
// inputi është zanore apo bashkëtingëllore. Nëse inputi nuk është një shkronjë të afishohet mesazh
// gabimi. Përdorni metodën isLetter të klasës Character.

import java.util.Scanner;

public class Usht9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a character: ");
    String inputChar = scanner.next().toLowerCase();

    String zanore = "aeëiouy";

    if (!Character.isLetter(inputChar.charAt(0))) {
      System.out.println("Gabim");
    } else if (zanore.contains(inputChar)) {
      System.out.println("Zanore");
    } else {
      System.out.println("Bashtingellore");
    }

    scanner.close();
  }
}
