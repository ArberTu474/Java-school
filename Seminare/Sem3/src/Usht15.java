// 15. ATM kërkon PIN për tu identifikuar dhe aksesuar llogarinë. Nëse përdoruesi vendos një PIN të
// gabuar më shumë se 3 herë, ATM do të bllojë kartën. Supozoni që PIN i përdoruesit është 1234.
// Ndërtoni një program që pyet përdoruesin për PIN jo më shumë se 3 herë. Nëse përdoruesi
// vendos PIN-in e saktë do të afishohet “PIN është i saktë” dhe programi do të përfundojë. Nëse
// përdoruesi vendos një PIN të gabuar, do të afishohet “PIN jo i saktë” dhe nëse përdoruesi ka
// vendosur PIN jo më shumë se 3 herë mund ta vendosi PIN përsëri. Nëse përdoruesi ka vendosur
// një PIN të gabuar tre herë, të afishohet mesazhi “Karta juaj është bllokuar”.

import java.util.Scanner;

public class Usht15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numberOfAttempts = 3;
    int userPIN = 1234;

    int enteredPIN;

    do {
      System.out.print("Enter your PIN: ");
      enteredPIN = scanner.nextInt();
      numberOfAttempts--;

      if (enteredPIN == userPIN) {
        System.out.println("PIN është i saktë\n");
      } else {
        System.out.println("PIN jo i saktë\n");
      }

      if (numberOfAttempts == 0) {
        System.out.println("Karta juaj është bllokuar");
      }
    } while (numberOfAttempts != 0 && userPIN != enteredPIN);

    scanner.close();
  }
}
