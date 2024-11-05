// Following Section 4.9, develop a program that reads text and displays the average
// number of words in each sentence. Assume words are separated by spaces, and a
// sentence ends when a word ends in a period.

import java.util.Scanner;

public class Pro6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Write your sentences: ");
    String text = scanner.nextLine().trim() + " ";

    int wordCount = 0;
    int sentenceCount = 0;

    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == ' ') {
        wordCount++;
      }

      if (text.charAt(i) == '.') {
        sentenceCount++;
      }
    }

    double averageWordsPerSenetence = (double) wordCount / sentenceCount;

    System.out.println(averageWordsPerSenetence + " words per sentence.");

    scanner.close();
  }
}
