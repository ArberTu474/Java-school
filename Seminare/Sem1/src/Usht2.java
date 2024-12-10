// Ndërtoni një program që afishon balancën e një llogarie pas vitit të parë, të dytë dhe
// të tretë. Llogaria ka një balancë fillestare 1000$ dhe ka interes 5% në vit.

public class Usht2 {
  public static void main(String[] args) {
    double balance = 1000;

    for (int i = 0; i < 3; i++) {
      balance = balance * 1.05;

      // System.out.println("Viti " + (i + 1) + " " + balance + " $");
      System.out.printf("Viti %d %4.2f $\n", i + 1, balance);
    }
  }
}
