// Ndërtoni një program që kërkon të gjithë skedarët në command line dhe afishon të gjithë rreshtat
// që përmbajnë një fjalë të caktuar. Për shembull, nëse inputet tuaja janë
// java Find ring report.txt address.txt Homework.java
// atëherë programi do të afishojë
// report.txt: has broken up an international ring of DVD bootleggers that
// address.txt: Kris Kringle, North Pole
// address.txt: Homer Simpson, Springfield
// Homework.java: String filename;
// Fjalët që kërkohen janë gjithmonë argumentet e para në command line.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Usht5 {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Please input the word and the name of the files.");
      return;
    }

    String word = args[0];

    for (int i = 1; i < args.length; i++) {
      String fileName = args[i];

      File file = new File(fileName);

      try {
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
          String line = reader.nextLine();

          if (line.contains(word)) {
            System.out.println(fileName + ": " + line);
          }
        }
        reader.close();
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }

    }
  }
}
