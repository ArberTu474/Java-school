// Vitet e brishta plotëpjestohen me 4. Shkruani program që kërkon nga përdoruesi një vit dhe më pas afishon nëse
// viti është i brishtë ose jo.

import java.util.Scanner;

public class Usht12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Vendos vition: ");
    int year = scanner.nextInt();
    if (year % 4 == 0) {
      System.out.println("Vit i brishte");
    } else {
      System.out.println("Vit jo i brishte");
    }

    scanner.close();
  }
}
