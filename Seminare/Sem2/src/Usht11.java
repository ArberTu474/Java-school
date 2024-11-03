// Ndërtoni një program që lexon dy orë sipas formatit (0900,1730) dhe afishon numrin e orëve dhe
// minutave midis dy orëvë. Për shembull:
// Ju lutemi vendosni orën e parë: 0900
// Ju lutemi vendosni orën e dytë; 1730
// 8 orë 30 minuta

// 012345678910
// (HHMM,HHMM)

import java.util.Scanner;

public class Usht11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first time: ");
    String input1 = scanner.nextLine();
    System.out.print("Enter the second time: ");
    String input2 = scanner.nextLine();

    scanner.close();

    int start_hour = Integer.parseInt((String) input1.subSequence(0, 2));
    int end_hour = Integer.parseInt((String) input2.subSequence(0, 2));

    int start_minute = Integer.parseInt((String) input1.subSequence(2, 4));
    int end_minute = Integer.parseInt((String) input2.subSequence(2, 4));

    if (start_minute > end_minute) {
      end_hour -= 1;
      end_minute += 60;
    }

    int minutes = end_minute - start_minute;
    int hours = end_hour - start_hour;

    if (hours < 0) {
      hours = 24 + hours;
    }

    System.out.println("\n" + hours + ":" + minutes);
  }
}
