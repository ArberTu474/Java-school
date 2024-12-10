// Ndërtoni një program që lexon një skedar nga përdoruesi. Skedari ka dy kolona me numra me
// presje dhjetore. Afishoni mesataren e secilit rresht.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Usht3 {
  public static void main(String[] args) {
    final String inputFile = "Usht3-input.txt";

    File file = new File(inputFile);
    try {
      Scanner reader = new Scanner(file);

      while (reader.hasNextLine()) {

        double sum = 0.0;
        for (int i = 0; i < 2; i++) {
          sum += reader.nextDouble();
        }
        System.out.println(sum / 2);
      }
      reader.close();
    } catch (FileNotFoundException e) {

      e.printStackTrace();
    }
    ;
  }
}
