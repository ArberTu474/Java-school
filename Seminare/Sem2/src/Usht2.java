// Le të jetë n një numër i plotë dhe x një numër me presje notuese. Shpjegoni ndryshimin midis tyre.

public class Usht2 {
  public static void main(String[] args) {

    int n;
    double x = 4.7;

    n = (int) x;
    System.out.println("Menyra 1: " + n);
    n = (int) Math.round(x);
    System.out.println("Menyra 2: " + n);
  }
}
