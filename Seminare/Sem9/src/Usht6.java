// Riimplementoni klasën CashRegister e cila ruan cmimin e çdo artikulli të shtuar në arraylist.
// Riimplementoni metodat. Shtoni metodën e cila do të shfaqë të gjithë çmimet e të gjithë artikujve
// të shitur.

public class Usht6 {
  public static void main(String[] args) {
    CashRegister register1 = new CashRegister();

    register1.addItem(20);
    register1.addItem(13.65);
    register1.addItem(2.34);
    register1.addItem(10);

    System.out.printf("Total: $%.2f\n", register1.getTotal());
    register1.displayAll();

  }
}
