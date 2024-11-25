// Ndërtoni një program i cili mbush dy array lista list1 dhe list2 derisa përdoruesi vendos -1 për të
// përfunduar. Për këtë ndërtoni një metodë që do të krijojë dy listat. Ndërtoni një metodë që merr
// si parametër list1 dhe list2 dhe kthen bashkimin e list1 me list2. Ndërtoni një metodë tjetër që
// merr si parametër list1 dhe kthen një arraylist të re që ka të njëjtat fjalë si list1 por nuk përmban
// elementët e përsëritur.

import java.util.ArrayList;
import java.util.Scanner;

public class Usht7 {
  public static void main(String[] args) {
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();

    list1 = fillArrayList(list1);
    list2 = fillArrayList(list2);

    System.out.println("List 1");
    System.out.println(list1);
    System.out.println("List 2");
    System.out.println(list2);
    System.out.println();
    System.out.println("Combined list");
    System.out.println(combine(list1, list2));
    System.out.println();
    System.out.println("Unique elements of list1: ");
    System.out.println(uniqueElements(list1));
    System.out.println("Unique elements of list2: ");
    System.out.println(uniqueElements(list2));
  }

  public static ArrayList<String> fillArrayList(ArrayList<String> list) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string (any other input stops the loop)");
    while (!scanner.hasNextInt()) {
      list.add(scanner.next());
    }
    return list;
  }

  public static ArrayList<String> combine(ArrayList<String> a, ArrayList<String> b) {
    ArrayList<String> result = new ArrayList<String>();
    result.addAll(a);
    result.addAll(b);
    return result;
  }

  public static ArrayList<String> uniqueElements(ArrayList<String> a) {
    ArrayList<String> result = new ArrayList<String>();

    for (int i = 0; i < a.size(); i++) {
      boolean unique = true;
      for (int j = 0; j < a.size(); j++) {
        if (i != j && a.get(i).equals(a.get(j))) {
          unique = false;
          break;
        }
      }
      if (unique) {
        result.add(a.get(i));
      }
    }

    return result;
  }
}
