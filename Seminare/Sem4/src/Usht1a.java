// 1. Shkruani një program që llogarit:
// a. Shumën e numrave çift midis a dhe b, ku a dhe b merren nga përdoruesi.
// b. Shumën e numrave tek të shifrave të dhëna nga përdoruesi. Për shembull nëse inputi është
// 32677, shuma e numrave do të ishte 3+7+7=17.

import java.util.Scanner;

public class Usht1a {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start: ");
        int a = scanner.nextInt();

        System.out.print("Enter the end: ");
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
