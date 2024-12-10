// 11. Ndërtoni një program që llogarit taksën sipas skedës së mëposhtme.

import java.util.Scanner;

public class Usht11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        System.out.print("Are you single (y/n): ");
        boolean single = true;

        double tax;

        if (single) {
            // Single
            if (income > 8000 && income < 32000) {
                tax = 800 + 0.15 * (income - 8000);
            } else if (income > 32000) {
                tax = 4400 + 0.25 * (income - 32000);
            } else {
                tax = income * 0.1;
            }
        } else {
            // Married
            if (income > 16000 && income < 64000) {
                tax = 16000 + 0.15 * (income - 16000);
            } else if (income > 32000) {
                tax = 8800 + 0.25 * (income - 64000);
            } else {
                tax = income * 0.1;
            }
        }

        System.out.printf("Tax is $%.2f\n", tax);
        scanner.close();
    }
}
