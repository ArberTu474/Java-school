// Shkruani një program i cili i afishon përdoruesit pyejtjen : Deëshironi të vazhdoni? dhe lexon
// inputin e përdoruesit. Nëse përdoruesi shtyp Po, Y, Yes, OK, Sigurisht afishoni OK. Nëse
// përdoruesi fut të dhënat NO, N, JO afisho Përfundim. Përndryshe afisho input i gabuar. Programi
// nuk duhet të bëjë dallim në shkronja të vogla apo të mëdha të përdoruesit. Shembull jo është
// ekuivalente me JO.

import java.util.Scanner;

public class Usht13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Deshironi te vazhdoni? ");
    String response = scanner.nextLine().toLowerCase();

    if (response.equals("po") ||
        response.equals("y") ||
        response.equals("yes") ||
        response.equals("ok") ||
        response.equals("sigurisht")) {
      System.out.println("OK");
    } else if (response.equals("no") ||
        response.equals("n") ||
        response.equals("jo")) {
      System.out.println("Perfundim");
    } else {
      System.out.println("Input i gabuar");
    }

    scanner.close();
  }
}
