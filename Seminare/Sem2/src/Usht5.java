// 5. Shkruani kodin që në një string
// a) Merr karakterin e parë
// b) Merr karakterin e fundit
// c) Heq karakterin e parë
// d) Heq karakterin e fundit

public class Usht5 {
  public static void main(String[] args) {
    String name = "Arber";

    // a) Get the first character
    System.out.println("a) " + name.charAt(0));

    // b) Get the last character
    System.err.println("b) " + name.charAt(name.length() - 1));

    // c) Remove the first character
    System.out.println("c) " + name.substring(1, name.length()));

    // d) Remove the last character
    System.err.println("d) " + name.substring(0, name.length() - 1));

  }
}
