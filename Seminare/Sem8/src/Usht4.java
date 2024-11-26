// Ndërtoni një program që kërkon nga përdoruesi emrin e skedarit dhe afishon numrin e
// karaktereve, fjalëve dhe rreshtave në skedar.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Usht4 {
  public static void main(String[] args) {
    final String inputFile = "Usht4-input.txt";

    int rows = 0;
    int words = 0;
    int chars = 0;

    File file = new File(inputFile);
    try {
      Scanner reader = new Scanner(file);

      while (reader.hasNextLine()) {
        rows++;
        String row = reader.nextLine().trim();

        for (int i = 0; i < row.length(); i++) {
          if (row.charAt(i) == ' ' || row.charAt(i) == '\n') {
            words++;
          } else {
            chars++;
          }
        }
      }
      words++;
      reader.close();
    } catch (FileNotFoundException e) {

      e.printStackTrace();
    }

    System.out.println("Rows: " + rows);
    System.out.println("Words: " + words);
    System.out.println("Chars: " + chars);

  }

}
