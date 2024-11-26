// Ndërtoni një program që lexon çdo rresht të një skedari, kthen mbrapsht çdo rresht të skedarit
// dhe i shkruan ato në një skedar tjetër. Për shembull, nëse skedari input.txt përmban rreshtat
// Mary had a little lamb
// Its fleece was white as snow
// And everywhere that Mary went
// The lamb was sure to go.
// dhe ju ekzekutoni
// reverse input.txt output.txt
// skedari output.txt do të mbajë rreshtat e mëposhtëm:
// The lamb was sure to go.
// And everywhere that Mary went
// Its fleece was white as snow
// Mary had a little lamb

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Usht7 {
  public static void main(String[] args) {
    final String inputFile = "Usht7-input.txt";
    final String outputFile = "Usht7-output.txt";

    File inFile = new File(inputFile);
    StringBuilder reveresedText = new StringBuilder();

    try {
      Scanner reader = new Scanner(inFile);

      while (reader.hasNextLine()) {
        StringBuilder line = new StringBuilder(reader.nextLine());
        reveresedText.insert(0, System.lineSeparator()).insert(0, line);
      }
      reader.close();
    } catch (FileNotFoundException e) {

      e.printStackTrace();
    }

    File outFile = new File(outputFile);

    try {
      PrintWriter writer = new PrintWriter(outFile);
      writer.write(reveresedText.toString());
      writer.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(reveresedText);
  }
}
