// Ndërtoni një metodë që merr si parametër një numër dhe kthen
// a. Shifrën e parë
// b. Shifrën e fundit
// c. Numrin e shifrave
// Ndërtoni programin testues të metodave.

public class Usht2 {
  public static void main(String[] args) {
    System.out.println("First Digit: " + firstDigit(28));
    System.out.println("Last Digit: " + lastDigit(436));
    System.out.println("NUmber length: " + length(-436));
  }

  public static int firstDigit(int num) {
    int length = (int) Math.log10(Math.abs(num)) + 1;
    return (int) (Math.abs(num) / Math.pow(10, length - 1));
  }

  public static int lastDigit(int num) {
    return num % 10;
  }

  public static int length(int num) {
    return (int) Math.log10(Math.abs(num)) + 1;
  }
}
