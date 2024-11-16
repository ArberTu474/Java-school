public class GenGrid {
  public static void main(String[] args) {
    final int size = 80;

    for (int i = 0; i < size; i++) {
      System.out.print("{");
      for (int j = 0; j < size; j++) {
        if (i == size / 2 && j == size / 2) {

          System.out.print("'*', ");
        }
        System.out.print("'░', ");
      }
      System.out.print("},\n");
    }
  }
}
