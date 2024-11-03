// Ndërtoni një program që lexon një numër të plotë pozitiv ose negativ dhe kontrollon sa shifra
// numri ka duke kontrolluar nëse numri >=10, >=100 e kështu me rradhë deri kur numri të jetë më i
// madh se 100000.

import java.util.Scanner;

public class Usht2 {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);

    int input = scanner.nextInt();

    if (input >= 1000000) {
      System.out.println("Numri eshte shume i madh");
    } else if (input >= 100000) {
      System.out.println("6 shifra");
    } else if (input >= 10000) {
      System.out.println("5 shifra");
    } else if (input >= 1000) {
      System.out.println("4 shifra");
    } else if (input >= 100) {
      System.out.println("3 shifra");
    } else if (input >= 10) {
      System.out.println("2 shifra");
    } else {
      System.out.println("1 shifer");
    }

    scanner.close();
  }
}
