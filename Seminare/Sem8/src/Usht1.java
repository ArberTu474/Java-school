// Shkruani një program që kryen detyrat e mëposhtme:
// Hap skedarin me emrin hello.txt.
// Ruaj mesazhin “Hello World!” në skedar.
// Mbyll skedarin.
// Hap përsëri skedarin.
// Lexo mesazhin në një variabël string dhe afishojeni atë.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Usht1 {
  public static void main(String[] args) {
    final String fileName = "Usht1-hello.txt";

    try {
      // Shkruajme tek file-i
      PrintWriter out = new PrintWriter(fileName);
      out.println("Hello World!");
      out.close();

      // Lexojme file-in
      File file = new File(fileName);
      Scanner write = new Scanner(file);

      String words = write.nextLine();

      write.close();
      System.out.println(words);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }
}
