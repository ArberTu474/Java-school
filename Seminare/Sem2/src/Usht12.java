// Ndërtoni një program që transformon numrat 1,2,3,.....,12 në emrat korresponues Janar, Shkurt,
// Mars, ....., Dhjetor. Ndihmesë: ndërtoni një string shumë të gjatë “Janar Shkurt Mars ......” në të
// cilin jut ë vendosni hapësira në mënyrë të tillë që një emër muaji të ketë të njëjtën gjatësi. Më pas
// përdorni metodën substring për të ekstraktuar muajin që dëshironi.

// Janar  
// Shkurt 
// Mars   
// Prill  
// Maj    
// Qershor
// Korrik 
// Gusht  
// Shtator
// Tetor  
// Nentor 
// Dhjetor

import java.util.Scanner;

public class Usht12 {
  public static void main(String[] args) {
    String months = "Janar  Shkurt Mars   Prill  Maj    QershorKorrik Gusht  ShtatorTetor  Nentor Dhjetor";

    System.out.print("Enter the number of the month: ");
    Scanner scanner = new Scanner(System.in);

    int monthNumber = scanner.nextInt();
    scanner.close();

    System.out.println(months.substring(7 * (monthNumber - 1), monthNumber * 7).trim());
  }
}
