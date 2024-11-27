// Implementoni një klasë Population e cili simulon rritjen e popullsisë. Konstruktori merr numrin e
// popullsisë fillestare. Ndërtoni një metodë e cila simulon rritjen e popullsisë duke e dyfishuar atë,
// një metodë e cila e zvogëlon popullsinë me 10% dhe një metodë e cila kthen numrin aktual të
// popullsisë. Ndërtoni programin i cili afishon dy herë numrin e popullsisë pas rritjes dhe zvogëlimit
// të saj dy herë.

public class Population {
  final private int SHRINK_AMOUNT = 10;
  private int population;

  public Population(int population) {
    this.population = population;
  }

  public int getPopulation() {
    return population;
  }

  public void growPopulation() {
    this.population *= 2;
  }

  public void shrinkPopulation() {
    population -= population * (SHRINK_AMOUNT / 100.0);
  }
}
