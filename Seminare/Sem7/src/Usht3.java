// Ndërtoni një metodë public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a,
// ArrayList<Integer> b) që bashkon dy array lista të renditura, duke prodhuar një array list të re të
// renditur. Nëse a është 1 4 9 16 dhe b është 4 7 9 9 11 atëherë metoda do të kthejë 1 4 4 7 9 9 9
// 11 16.

import java.util.ArrayList;
import java.util.Arrays;

public class Usht3 {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 4, 9, 16));
    ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(4, 7, 9, 9, 11));

    ArrayList<Integer> meregedSorted = mergeSorted(a, b);

    System.out.println(meregedSorted);
  }

  public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
    ArrayList<Integer> result = new ArrayList<>();

    int i = 0;
    int j = 0;

    while (i < a.size() && j < b.size()) {
      if (a.get(i) < b.get(j)) {
        result.add(a.get(i));
        i++;
      } else {
        result.add(b.get(j));
        j++;

      }
    }
    
    while (i < a.size()) {
      result.add(a.get(i));
      i++;
    }
    while (j < a.size()) {
      result.add(b.get(j));
      j++;
    }

    return result;
  }

}
