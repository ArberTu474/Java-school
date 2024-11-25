// Ndërtoni një metodë public static ArrayList<Integer> merge (ArrayList<Integer> a,
// ArrayList<Integer> b), e cila bashkon dy array lista, duke alternuar elementë nga të dy arraylistat.
// Nëse një nga arraylistat është më e vogël se tjetra, atëherë kryeni alternimet për sa kohë që është
// e mundur dhe më pas shtoni elementët e mbetur nga array lista më e gjatë. Për shembull, nëse a
// është 1 4 9 16 dhe b është 9 7 4 9 11 atëherë metoda do të kthejë array listën 1 9 4 7 9 4 16 9 11.

import java.util.ArrayList;
import java.util.Arrays;

public class Usht2 {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 4, 9, 16));
    ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(9, 7, 4, 9, 11));
    ArrayList<Integer> c = merge(a, b);

    System.out.println(c);
  }

  public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
    ArrayList<Integer> meregedArray = new ArrayList<Integer>();

    for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
      if (i < a.size()) {
        meregedArray.add(a.get(i));
      }
      if (i < b.size()) {
        meregedArray.add(b.get(i));
      }
    }

    return meregedArray;
  }
}
