// Ndërtoni një program i cili pasi lexon disa Stringje nga përdoruesi i rendit ato nga ana leksikore
// duke i vendosur në vendin e duhur në një arraylist. Përdoruesi përcakton fundin e stringjeve
// nëpërmjet numrit -1.
// Për shembull nëse stringjet janë:
// Sonja
// Ralf
// Tani
// Artan
// Atëherë arraylist duhet të rritet si më poshtë:
// [Empy]
// [Sonja]
// [Ralf, Sonja]
// [Ralf, Sonja,Tani]
// [Artan, Ralf, Sonja,Tani]

import java.util.ArrayList;
import java.util.Scanner;

public class Usht8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<String>();

    System.out.println("Enter strings:");
    while (!scanner.hasNextInt()) {
      names.add(scanner.next());
    }

    names.sort(null);

    System.err.println(names);
    scanner.close();
  }
}
