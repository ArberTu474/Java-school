import java.util.Scanner;

public class Usht2a {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your number: ");

    int input = scanner.nextInt();

    int length = Integer.toString(Math.abs(input)).length();

    System.out.println("Numri ka: " + length + " shifra.");

    scanner.close();
  }
}