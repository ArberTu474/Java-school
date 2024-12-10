// Write a program that reads an integer n and a digit d between 0 and 9. Use one or
// more loops to count how many of the integers between 1 and n
// • start with the digit d.
// • end with the digit d.
// • contain the digit d.

import java.util.Scanner;

public class Pro14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.print("Enter a digit: ");
        int d = scanner.nextInt();

        if (d < 0 || d > 9) {
            System.out.println("The didit must be between 0 and 9.");
            scanner.close();
            return;
        }

        String digitString = Integer.toString(d);

        int startsWithD = 0;
        int endsWithD = 0;
        int containsWithD = 0;

        for (int i = 1; i <= n; i++) {
            String digit = Integer.toString(i);

            if (digit.startsWith(digitString)) {
                startsWithD++;
            }

            if (digit.endsWith(digitString)) {
                endsWithD++;
            }

            if (digit.contains(digitString)) {
                containsWithD++;
            }
        }
        System.out.printf("Start with: %d\n", startsWithD);
        System.out.printf("End with: %d\n", endsWithD);
        System.out.printf("Contain with: %d\n", containsWithD);

        scanner.close();
    }
}
