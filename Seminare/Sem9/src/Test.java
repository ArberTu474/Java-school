public class Test {
  public static void main(String[] args) {
    String test = "Hello";
    String test2 = "HelloThere";

    double number = 20.45;
    System.out.printf("%(8.2f\n", number);
    System.out.printf("%(8.2f\n", 233.46);
    System.out.printf("%8.2f\n", 233.46);

    System.out.printf("%-8s\n", test);
    System.out.printf("%-8s\n", test2);
  }
}
