// Cila është vlera e shprehjeve të mëposhtme? Në çdo rresht supozoni se:
// String s = "Hello";
// String t = "World";
// a. s.length() + t.length()
// b. s.substring(1, 2)
// c. s.substring(s.length() / 2, s.length())
// d. s + t

public class Usht4 {
  public static void main(String[] args) {
    String s = "Hello";
    String t = "World";

    System.out.println(s.length() + t.length());
    System.out.println(s.substring(1, 2));
    System.out.println(s.substring(s.length() / 2, s.length()));
    System.out.println(s + t);
  }
}

// a) 10
// b) e
// c) llo
// d) HelloWorld