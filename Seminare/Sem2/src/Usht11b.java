// Ndërtoni një program që lexon dy orë sipas formatit (0900,1730) dhe afishon numrin e orëve dhe
// minutave midis dy orëvë. Për shembull:
// Ju lutemi vendosni orën e parë: 0900
// Ju lutemi vendosni orën e dytë; 1730
// 8 orë 30 minuta

// 012345678910
// (HHMM,HHMM)

import java.util.Scanner;

public class Usht11b {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first time: ");
    int input1 = scanner.nextInt();
    System.out.print("Enter the second time: ");
    int input2 = scanner.nextInt();

    int hours1 = input1 / 100 * 60;
    int hours2 = input2 / 100 * 60;

    int miutes1 = input1 % 100;
    int miutes2 = input2 % 100;

    int totalTime1 = hours1 + miutes1;
    int totalTime2 = hours2 + miutes2;

    int timeDifference = Math.abs(totalTime1 - totalTime2);

    System.out.println((timeDifference / 60) + ":" + (timeDifference % 60));

    scanner.close();
  }
}
