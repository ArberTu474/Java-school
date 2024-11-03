import java.util.Scanner;

public class Usht6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your values. Pres (Q) to quit.");

    double currentValue;
    double xi2 = 0.0;

    int count = 0;
    double sum = 0.0;

    while (true) {
      System.out.print(">>> ");
      String input = scanner.next().toLowerCase();

      if (input.equals("q")) {
        System.out.println("Ended");
        break;
      }

      currentValue = Double.parseDouble(input);
      sum += currentValue;

      xi2 += currentValue * currentValue;

      count++;
    }

    double _x = sum / count;

    double s = Math.sqrt((xi2 - (sum * sum / count)) / count - 1);

    System.out.printf("Sum:\t%.2f\n", _x);
    System.out.printf("D:\t%.2f\n", s);

    scanner.close();
  }
}
