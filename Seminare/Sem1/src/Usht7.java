// Ekzekutoni programin e mëposhtëm. Më pas modifikojeni atë duke afishuar
// Përshëndetje emër, ku emër do të jetë emrin që ka futur përdoruesi.

import javax.swing.JOptionPane;

public class Usht7 {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("What is your name?");
    System.out.println("Hello" + name);
  }
}
