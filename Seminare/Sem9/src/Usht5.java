// Implementoni një klasë Population e cili simulon rritjen e popullsisë. Konstruktori merr numrin e
// popullsisë fillestare. Ndërtoni një metodë e cila simulon rritjen e popullsisë duke e dyfishuar atë,
// një metodë e cila e zvogëlon popullsinë me 10% dhe një metodë e cila kthen numrin aktual të
// popullsisë. Ndërtoni programin i cili afishon dy herë numrin e popullsisë pas rritjes dhe zvogëlimit
// të saj dy herë.

public class Usht5 {
  public static void main(String[] args) {
    Population example = new Population(100);
    example.growPopulation();
    System.out.println(example.getPopulation());
    example.shrinkPopulation();
    System.out.println(example.getPopulation());

  }
}
