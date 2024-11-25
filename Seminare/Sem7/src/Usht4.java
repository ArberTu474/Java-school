// Ndërtoni një metodë që modifikon një Array list me stringje, duke zhvendosur të gjitha stringjet që
// fillojnë me shkronjë të madhe në fillim, pa ndryshuar renditjen e elementëve të tjerë.

import java.util.ArrayList;
import java.util.Arrays;

public class Usht4 {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<String>(Arrays.asList("ana", "mira", "Beni", "joni", "Arber"));
    reorder(words);
    System.out.println(words);
  }

  public static void reorder(ArrayList<String> list) {
    ArrayList<String> upperCaseWords = new ArrayList<String>();

    for (int i = 0; i < list.size(); i++) {
      if (!list.get(i).isEmpty() && Character.isUpperCase(list.get(i).charAt(0))) {
        upperCaseWords.add(list.get(i));
        list.remove(list.get(i));
      }
    }

    list.addAll(0, upperCaseWords);
  }
}
