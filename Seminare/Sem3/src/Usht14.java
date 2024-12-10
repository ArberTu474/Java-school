// 14. Shkruani një program që lexon emrin dhe pagën për orë të një punonjësi. Më pas kërkon orët e
// punuara javën e kaluar dhe llogarisni pagesën. Çdo punë jashtë orarit (mbi 40 orë për javë)
// paguhet me 150 % të pagës së rregullt.

import java.util.Scanner;

public class Usht14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Vendosni emrin: ");
    String name = scanner.nextLine();

    System.out.print("Vendosni pagesen ne ore pune: ");
    double wage = scanner.nextDouble();

    System.out.print("Sa ore pune keni javen e kaluar: ");
    double workHours = scanner.nextDouble();

    double payment;
    if (workHours > 40) {
      payment = wage * 40 + wage * 1.5 * ((workHours - 40));
    } else {
      payment = wage * workHours;
    }

    System.out.println(name + ", paga juaj eshte: " + payment + " lek");

    scanner.close();

  }
}
