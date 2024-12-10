// Ndërtoni një program që lexon një numër të plotë dhe afishon nëse numri është pozitiv, negative
// ose i barabartë me zero. Përdorni if të kushtëzuar.

import java.util.Scanner;

public class Usht1 {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if (input > 0) {
            System.out.println("Positive number");
        } else if (input < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Your number is zero");
        }

        scanner.close();
    }
}
