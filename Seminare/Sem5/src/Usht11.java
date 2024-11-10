// Ndërtoni një metodë statike public static double readDouble(String prompt) e cila i shfaq një String
// përdoruesit, lexon numrin dhe më pas e kthen atë.
// Për shembull:
// paga = readDouble (“Ju lutem vendosni pagën”) ;

import java.util.Scanner;

public class Usht11 {
  public static void main(String[] args) {
    double paga = readDouble("Vendosni pagen tuaj");

    System.out.println("Paga juaj eshte: " + paga);

  }

  public static double readDouble(String promt) {
    System.out.print(promt.trim() + " ");

    Scanner scanner = new Scanner(System.in);
    return scanner.nextDouble();
  }
}
