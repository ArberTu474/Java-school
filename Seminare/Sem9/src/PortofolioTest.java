// Implement a class Portfolio. This class has two objects, checking and savings, of the
// type BankAccount that was developed in How To 8.1 (ch08/how_to_1/Bank­­Account.java in
// the companion code for this book). Implement four methods:
// • public void deposit(double amount, String account)
// • public void withdraw(double amount, String account)
// • public void transfer(double amount, String account)
// • public double getBalance(String account)
// Here the account string is "S" or "C". For the deposit or withdrawal, it indicates which
// account is affected. For a transfer, it indicates the account from which the money is
// taken; the money is automatically trans­ferred to the other account.

public class PortofolioTest {
  public static void main(String[] args) {
    Portofolio myPortofolio = new Portofolio(1000, 2300);

    myPortofolio.deposit(100, "C");
    System.out.println(myPortofolio);
    myPortofolio.transfer(100, "S");
    System.out.println(myPortofolio);
  }
}
