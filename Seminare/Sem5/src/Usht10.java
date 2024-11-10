// Njihet si fenomen që shumica e njerëzve mund të lexojnë një tekst i cili ka dy karaktere që kanë
// ndryshuar vendin e tyre, por shkronja e parë dhe e fundit e secilës fjalë të mos ndryshojë. Ndërtoni
// një metodë që merr si parametër një fjalë dhe ndërton një version të një teksti të tillë duke ndërruar
// në mënyrë random dy karaktere në fjalë pa shkronjën e parë dhe të fundit. Ndërtoni një program
// që lexon fjalët dhe kthen fjalët e ndryshuara.

import java.util.Random;

public class Usht10 {
  public static void main(String[] args) {
    System.out.println(randomizeWord("abcdef"));
  }

  public static StringBuilder randomizeWord(String str) {
    Random random = new Random();

    // random.nextInt(max - min + 1) + min

    int randomIndex1;
    int randomIndex2;
    do {
      randomIndex1 = random.nextInt(str.length() - 2 - 1 + 1) + 1;
      randomIndex2 = random.nextInt(str.length() - 2 - 1 + 1) + 1;
    } while (randomIndex1 == randomIndex2);

    String fistChar = str.substring(randomIndex1, randomIndex1 + 1);
    String secondChar = str.substring(randomIndex2, randomIndex2 + 1);

    StringBuilder resultString = new StringBuilder(str);

    resultString.setCharAt(randomIndex2, fistChar.charAt(0));
    resultString.setCharAt(randomIndex1, secondChar.charAt(0));

    return resultString;
  }
}
