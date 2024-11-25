// Ndërtoni një metodë që numëron numrin e elementëve të ndryshëm në një tabelë me stringje pa
// modifikuar arraylistën.

import java.util.ArrayList;
import java.util.Arrays;

public class Usht6 {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<String>(Arrays.asList("a", "b", "c", "a", "d", "d", "e"));
    ArrayList<String> uniqueWords = new ArrayList<String>();

    int count = 0;

    for (int i = 0; i < words.size(); i++) {
      boolean unique = true;
      for (int j = 0; j < words.size(); j++) {
        if (i != j && words.get(i).equals(words.get(j))) {
          unique = false;
          break;
        }
      }
      if (unique) {
        uniqueWords.add(words.get(i));
        count++;
      }
    }

    System.out.println(words);
    System.out.println(uniqueWords);
    System.out.println("Unique elements: " + count);
  }
}
