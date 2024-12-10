// Ndërtoni një metodë statike e cila numëron fjalët në një string str. Fjalën janë të ndara me hapësira
// ndërmjet tyre. Përdorni metodën trim() për të hequr hapësirat majtas dhe djathtas inputit dhe
// përdorni metodën isEmpty() për të kontrolluar nëse stringu është bosh ose jo.

import java.util.Scanner;

public class Usht6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your sentence: ");
    String inputSentence = scanner.nextLine();

    if (wordCounter(inputSentence) == -1) {
      System.out.println("Please input a sentence.");
    } else {
      System.out.println("Your sentence has: " + wordCounter(inputSentence) + " word/s.");
    }

    scanner.close();
  }

  public static int wordCounter(String sentence) {
    if (sentence.isEmpty()) {
      return -1;
    }

    sentence = sentence.trim();
    int wordsCount = 0;
    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i) == ' ') {
        wordsCount++;
      }
    }

    return wordsCount + 1;
  }
}
