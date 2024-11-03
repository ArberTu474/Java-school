// Cila është vlera e shprehjeve të mëposhtme? Në çdo rresht supozoni se:
// double x = 2.5;
// double y = -1.5;
// int m = 18;
// int n = 4;
// a. x + n * y - (x + n) * y
// b. m / n + m % n
// c. 5 * x - n / 5
// d. 1 - (1 - (1 - (1 - (1 - n))))
// e. Math.sqrt(Math.sqrt(n))

public class Usht3 {
  public static void main(String[] args) {
    double x = 2.5;
    double y = -1.5;
    int m = 18;
    int n = 4;

    System.out.println(x + n * y - (x + n) * y);
    System.out.println(m / n + m % n);
    System.out.println(5 * x - n / 5);
    System.out.println(1 - (1 - (1 - (1 - (1 - n)))));
    System.out.println(Math.sqrt(Math.sqrt(n)));
  }
}

// a) 6.25
// b) 6
// c) 12.5
// d) -3
// e) 1.4142135623730951