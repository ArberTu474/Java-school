// Ndërtoni një program që kontrollon nëse një fjalëkalim i përmbush rregullat e mëposhtme:
//  fjalëkalimi duhet të ketë të paktën 8 karaktere.
//  fjalëkalimi duhet të ketë të paktën një shkronjë të madhe dhe një shkronjë të vogël
//  fjalëkalimi duhet të ketë të paktën një numër.
// Ndërtoni metodat përkatëse. Nëse rregullat e fjalëkalimit nuk përputhen i kërkohet përdoruesit që
// ti vendosë përsëri të dhënat.

import java.util.Scanner;

public class Usht12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your password: ");
    String password = scanner.nextLine();

    System.out.println("Pasword safe? " + isPasswordSafe(password));

    scanner.close();
  }

  public static boolean isPasswordSafe(String password) {
    if (password.length() < 8) {
      return false;
    }

    // kontrollojme per shkronje te madhe, shkonje te vogel dhe nje numer
    boolean capitalFlag = false;
    boolean lowerCaseFlag = false;
    boolean numberFlag = false;
    for (int i = 0; i < password.length(); i++) {
      if (Character.isDigit(password.charAt(i))) {
        numberFlag = true;
      } else if (Character.isUpperCase(password.charAt(i))) {
        capitalFlag = true;
      } else if (Character.isLowerCase(password.charAt(i))) {
        lowerCaseFlag = true;
      }

      if (capitalFlag && lowerCaseFlag && numberFlag) {
        return true;
      }
    }

    return false;
  }
}
