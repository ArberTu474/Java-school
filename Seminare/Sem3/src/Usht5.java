// Ndërtoni një program që konverton vlerësimin me shkronja në vlerësim me numër. Shkronjat janë
// A, B, C, D dhe F e ndjekur nga + ose -. Vlerat numerike janë 4,3,2,1, dhe 0. F+ ose F- nuk ekzistojnë.
// + e rrit vlerën numerike me 0.3 ndërsa – e zvogëlon vlerën me 0.3. gjithsesi A+ ka vlerën 4.0.

// Jepni një shkronjë: B-
// Vlera numerike është 2.7

import java.util.Scanner;

public class Usht5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Jepni një shkronjë: ");
    String grade = scanner.nextLine();

    double points = 0.0;

    // Control for invalid grades
    if (grade.toLowerCase().equals("f-") || grade.toLowerCase().equals("f+")) {
      System.out.println("Note e parregullt");
    } else {
      // Calculate the points
      if (grade.toLowerCase().contains("a")) {
        points += 4;
      }
      if (grade.toLowerCase().contains("b")) {
        points += 3;
      }
      if (grade.toLowerCase().contains("c")) {
        points += 2;
      }
      if (grade.toLowerCase().contains("d")) {
        points += 1;
      }
      if (grade.toLowerCase().contains("f")) {
        points += 0;
      }

      if (grade.contains("-")) {
        points -= 0.3;
      } else if (grade.contains("+")) {
        points += 0.3;
      }

      if (points > 4) {
        points = 4;
      }

      System.out.println("Vlera numerike është: " + points);
    }
    scanner.close();
  }
}
