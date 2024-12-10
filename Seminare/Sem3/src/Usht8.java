// When two points in time are compared, each given as hours (in military time, rang­
// ing from 0 and 23) and minutes, the following pseudocode determines which comes
// first.
// If hour1 < hour2
// time1 comes first.
// Else if hour1 and hour2 are the same
// If minute1 < minute2
// 		 time1 comes first.
// Else if minute1 and minute2 are the same
// 		 time1 and time2 are the same.
// Else
// 		 time2 comes first.
// Else
// time2 comes first.
// Write a program that prompts the user for two points in time and prints the time that
// comes first, then the other time.

import java.util.Scanner;

public class Usht8 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first time: ");
    String militaryTime1 = scanner.next();

    System.out.print("Enter the second time: ");
    String militaryTime2 = scanner.next();

    int hour1 = Integer.parseInt(militaryTime1) / 100;
    int hour2 = Integer.parseInt(militaryTime2) / 100;

    int minute1 = Integer.parseInt(militaryTime1) % 100;
    int minute2 = Integer.parseInt(militaryTime2) % 100;

    if (hour1 < hour2) {
      System.out.println("1: " + militaryTime1 + "\n" + "2: " + militaryTime2);
    } else if (hour1 == hour2) {
      if (minute1 < minute2) {
        System.out.println("1: " + militaryTime1 + "\n" + "2: " + militaryTime2);
      } else if (minute1 == minute2) {
        System.out.println("The times are the same");
      } else {
        System.out.println("1: " + militaryTime2 + "\n" + "2: " + militaryTime1);
      }
    } else {
      System.out.println("1: " + militaryTime2 + "\n" + "2: " + militaryTime1);
    }

    scanner.close();
  }
}
