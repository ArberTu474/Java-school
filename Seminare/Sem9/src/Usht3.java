// Implementoni një klasë Makina me karakteristikat e mëposhtme. Një makine ka një efiçiencë
// nafte dhe një sasi të caktuar nafte në motorr. Efiçienca përcaktohet në kostruktor dhe niveli
// fillestar i naftës është 0. Ndërtoni një metodë drive e cila simulon lëvizjen e makinës për një
// distancë të caktuar, duke zvogëluar sasinë e naftës në motorr. Gjithashtu ndërtoni metodat
// getGazInTank, për sasinë e mbetur të naftës dhe addGas për të shtuar naftën. Për shembull:
// Makina m = neë Makina (50); //50 milje per galon
// m.addGaz(20); // mbushet me 20 galon
// m.drive(100); // 100 milje lecizje
// double gasLeft =a.getGasInTank();
// Ndërtoni klasën MakinaTester e cila teston të gjitha metodat.

public class Usht3 {
  public static void main(String[] args) {
    Car myCar = new Car(1);
    myCar.addGaz(100);
    myCar.drive(1);

    System.out.println(myCar.getGazLevel());

    System.out.println(myCar);
  }
}
