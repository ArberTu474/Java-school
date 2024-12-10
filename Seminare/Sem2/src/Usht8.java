// Ndërtoni një program që lexon nga përdoruesi shkronjën e drive (c), path-in (\Windows\System),
// emrin e skedarit (Readme), dhe tipin e skedarit (txt) dhe më pas afishon emrin e plotë të skedarit.
// C:\Windows\System\Readme.txt.

import java.util.Scanner;

public class Usht8 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your disk name: ");
    String diskName = scanner.nextLine();

    System.out.print("Enter file path: ");
    String filePath = scanner.nextLine();

    System.out.print("Enter file name: ");
    String fileName = scanner.nextLine();

    System.out.print("Enter file type: ");
    String fileType = scanner.nextLine();

    System.out.println(diskName.toUpperCase() + ":\\" + filePath + "\\" + fileName + "." + fileType);
    scanner.close();
  }
}
