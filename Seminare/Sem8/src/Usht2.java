// Ndërtoni një program që lexon një skedar tekst. Lexoni secilin rresht të skedarit dhe shkruajeni atë
// në skedarin output të ndjekur nga numri i rreshtit. Për shembull, nëse skedari input është:
// Mary had a little lamb
// Whose fleece was white as snow.
// And everywhere that Mary went,
// The lamb was sure to go!
// programi duhet të prodhojë skedarin output:
// /* 1 */ Mary had a little lamb
// /* 2 */ Whose fleece was white as snow.
// /* 3 */ And everywhere that Mary went,
// /* 4 */ The lamb was sure to go!
// Kërkoni nga përdoruesi emrat e skedarëve input dhe output.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Usht2 {
  public static void main(String[] args) {
    final String inputFile = "Usht2-input.txt";
    final String outputFile = "Usht2-output.txt";

    File file = new File(inputFile);
    try {
      Scanner read = new Scanner(file);
      PrintWriter print = new PrintWriter(outputFile);

      int i = 1;
      while (read.hasNextLine()) {
        print.printf("/* %d */ %s\n", i, read.nextLine());
        i++;
      }
      read.close();
      print.close();
      System.out.println("Success");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
