// Një supermarket jep kupona në varësi se sa ka shpenzuar konsumatori në blerje. Ndërtoni një
// program që llogarit dhe afishon vlerën e kuponit bazuar në blerjen në supermarket sipas tabelës
// së mëposhtme.

import java.util.Scanner;

public class Usht16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Vendosni shpenzimet tuaja: ");

    double expences = scanner.nextDouble();
    int coupon;

    if (expences < 10) {
      coupon = 0;
    } else if (expences > 10 && expences <= 60) {
      coupon = 8;
    } else if (expences > 60 && expences <= 150) {
      coupon = 10;
    } else if (expences > 150 && expences <= 210) {
      coupon = 12;
    } else {
      coupon = 14;
    }

    if (coupon == 0) {
      System.out.println("Ju nuk keni perfituar ndonje zbritje.");
    } else {
      System.out.printf("Ju perfituat nje zbritje prej $%.2f (%d%% e shumes tuaj)\n", expences * (coupon / 100.0),
          coupon);
    }

    scanner.close();
  }
}
