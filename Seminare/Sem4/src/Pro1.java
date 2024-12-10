// Enhance Worked Example 4.1 to check that the credit card number is valid. A valid
// credit card number will yield a result divisible by 10 when you:
// Form the sum of all digits. Add to that sum every second digit, starting with the
// second digit from the right. Then add the number of digits in the second step that are
// greater than four. The result should be divisible by 10.
// For example, consider the number 4012 8888 8888 1881. The sum of all digits is 89.
// The sum of the colored digits is 46. There are five colored digits larger than four, so
// the result is 140. 140 is divisible by 10 so the card number is valid.

import java.util.Scanner;

public class Pro1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your Credit Card number: ");
    String creditCardNumber = scanner.nextLine().replaceAll(" ", "");

    int allDigitSum = 0;
    int oddDigitSum = 0;
    int oddDigitsGraterThan4 = 0;

    for (int i = 0; i < creditCardNumber.length(); i++) {
      allDigitSum += Character.getNumericValue(creditCardNumber.charAt(i));

      if (i % 2 == 0) {
        oddDigitSum += Character.getNumericValue(creditCardNumber.charAt(i));

        if (creditCardNumber.charAt(i) > '4') {
          oddDigitsGraterThan4++;
        }
      }
    }

    int validationNUmber = allDigitSum + oddDigitSum + oddDigitsGraterThan4;

    if (validationNUmber % 10 == 0) {
      System.out.println("Valid Credit Card");
    } else {
      System.out.println("Unvalid Credit Card");

    }

    scanner.close();
  }

}
