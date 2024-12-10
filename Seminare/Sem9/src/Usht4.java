// Implementoni një klasë Product. Një produkt ka një emër dhe një çmim, për shembull neë Product
// (“Tost”, 29.95). Ndërtoni metodat getName, getPrice dhe reducePrice. Ndërtoni një program
// ProductPrinter i cili do afishojë emrin dhe çmimin e dy produkteve, do të reduktojë çmimin e tyre
// me 5$ dhe do të afishojë përsëri çmimet e tyre.

public class Usht4 {
  public static void main(String[] args) {
    Product apples = new Product("Apple", 6);
    System.out.println(apples);
    apples.reducePrice(5);
    System.out.println(apples);
  }
}
