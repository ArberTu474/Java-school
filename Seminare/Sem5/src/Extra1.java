// Write method headers for methods with the following descriptions.
// a. Computing the larger of two integers
// b. Computing the smallest of three floating-point numbers
// c. Checking whether an integer is a prime number, returning true if it is and ­­­
// false otherwise
// d. Checking whether a string is contained inside another string
// e. Computing the balance of an account with a given initial balance, an annual
// interest rate, and a num­ber of years of earning interest
// f. Printing the balance of an account with a given initial balance and an annual
// interest rate over a given number of years
// g. Printing the calendar for a given month and year
// h. Computing the weekday for a given day, month, and year (as a string such
// as "Monday")
// i. Generating a random integer between 1 and n

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Extra1 {
  public static void main(String[] args) {
    System.out.println("Max int: " + max(5, 6));
    System.out.println("Max double (3): " + minDouble(5, 6, 3));
    System.out.println("Is prime: " + isPrime(-4));
    System.out.println("Contains substring: " + containsSubstring("hello", "hell"));
    System.out.println("Balance: " + accountBalance(1000, 1, 1));
    printAccountBalance(1000, 1, 1);
    printCalendar(11, 2004);
  }

  public static int max(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }

  public static double minDouble(double a, double b, double c) {
    return Math.min(Math.min(a, b), c);
  }

  public static boolean isPrime(int num) {
    if (num <= 0) {
      return false;
    }
    for (int i = 2; i < Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static boolean containsSubstring(String str, String subStr) {
    if (str.contains(subStr)) {
      return true;
    }
    return false;
  }

  public static double accountBalance(double balance, double interestRate, int years) {
    for (int i = 0; i < years; i++) {
      balance *= (interestRate / 100.0 + 1);
    }

    return balance;
  }

  public static void printAccountBalance(double balance, double interestRate, int years) {
    for (int i = 0; i < years; i++) {
      balance *= (interestRate / 100.0 + 1);
    }

    System.out.println(balance);
  }

  public static void printCalendar(int month, int year) {
    // Create a calendar instance
    Calendar calendar = new GregorianCalendar(year, month - 1, 1);

    // Print the header
    System.out.printf("Calendar for %d/%d%n", month, year);
    System.out.println("Su Mo Tu We Th Fr Sa");

    // Get the day of the week of the first day of the month
    int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
    System.out.println(firstDayOfWeek);
    // Get the number of days in the month
    int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

    // Print leading spaces for the first day
    for (int i = 1; i < firstDayOfWeek; i++) {
      System.out.print("   ");
    }

    // Print the days of the month
    for (int day = 1; day <= daysInMonth; day++) {
      System.out.printf("%2d ", day);

      // Move to a new line after Saturday
      if ((day + firstDayOfWeek - 1) % 7 == 0) {
        System.out.println();
      }
    }

    // End the line after the last row if not already at the end
    if ((daysInMonth + firstDayOfWeek - 1) % 7 != 0) {
      System.out.println();
    }

  }
}
