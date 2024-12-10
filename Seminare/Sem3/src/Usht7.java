// Shkruani një program i cili pasi lexon tre Stringje i afishon ato të renditur sipas krahasimit leksikor.

// Ju lutem jepni tre stringje:
// Charlie
// Able
// Baker
// Inputet e renditur janë:
// Able
// Baker
// Charlie

import java.util.Scanner;

public class Usht7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Name 1: ");
    String name1 = scanner.nextLine();

    System.out.print("Name 2: ");
    String name2 = scanner.nextLine();

    System.out.print("Name 3: ");
    String name3 = scanner.nextLine();

    String temp;

    if (name1.compareTo(name2) > 0) {
      temp = name1;
      name1 = name2;
      name2 = temp;
    }
    if (name1.compareTo(name3) > 0) {
      temp = name1;
      name1 = name3;
      name3 = temp;
    }
    if (name2.compareTo(name3) > 0) {
      temp = name2;
      name2 = name3;
      name3 = temp;
    }

    System.out.println("Inputet e renditur janë:");
    System.out.println(name1);
    System.out.println(name2);
    System.out.println(name3);

    scanner.close();
  }
}
