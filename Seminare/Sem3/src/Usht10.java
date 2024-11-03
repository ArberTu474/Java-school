// 10. Ndërtoni një program që kërkon nga përdoruesi të vendosi muajin (1 për Janar, 2 për Shkurt etj.)
// dhe më pas afishon numrin e ditëve në atë muaj. Për muajin shkurt të afishohet 28 ose 29 ditë.

// 1 31
// 2 28/29
// 3 31
// 4 30
// 5 31
// 6 30
// 7 31
// 8 31
// 9 30
// 10 31
// 11 30
// 12 31

import java.util.Scanner;

public class Usht10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Vendosni numrin e muajit 1-12: ");
    int muaji = scanner.nextInt();

    int ditet;
    switch (muaji) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        ditet = 31;
        System.out.println("Muaji ka " + ditet + " dite.");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        ditet = 30;
        System.out.println("Muaji ka " + ditet + " dite.");
        break;
      case 2:
        System.out.println("Muaji ka 28 ose 29 dite.");
        break;

      default:
        System.out.println("Numri i muajit eshte i pavlefshem.");
    }

    scanner.close();
  }
}
