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

public class Portofolio {
  BankAccount checking;
  BankAccount savings;

  /**
   * Constructs a portofolio with zero in checking and savings.
   * 
   * @param checkingAmount
   * @param savingsAmount
   */
  public Portofolio(double checkingAmount, double savingsAmount) {
    this.checking = new BankAccount(checkingAmount);
    this.savings = new BankAccount(savingsAmount);
  }

  /**
   * Constructs a portofolio with a given amount in checking and savings.
   * 
   */
  public Portofolio() {
    this.checking = new BankAccount(0);
    this.savings = new BankAccount(0);
  }

  /**
   * Deposits money to a specific bank
   * 
   * @param amount  the money that will be deposited
   * @param account the name of the bank accout
   */
  public void deposit(double amount, String account) {
    if (account.equals("S")) {
      savings.deposit(amount);
    } else if (account.equals("C")) {
      checking.deposit(amount);
    }
  }

  /**
   * Withdraws money from a specific bank
   * 
   * @param amount  the money that will be withdrawn
   * @param account the name of the bank accout
   */
  public void withdraw(double amount, String account) {
    if (account.equals("S")) {
      savings.withdraw(amount);
    } else if (account.equals("C")) {
      checking.withdraw(amount);
    }
  }

  /**
   * Transfers money from a specific bank account to the other bank account
   * 
   * @param amount  the money that will be transfered
   * @param account the name of the account that the money is going to be
   *                transfered from
   */
  public void transfer(double amount, String account) {
    if (account.equals("S")) {
      savings.withdraw(amount);
      checking.deposit(amount);
    } else if (account.equals("C")) {
      checking.withdraw(amount);
      savings.deposit(amount);
    }
  }

  /**
   * 
   * 
   * @param account the name of the bank account
   * @return returns the specified account balance. If the name of the account
   *         does not match it returns -1.
   */
  public double getBalance(String account) {
    if (account.equals("S")) {
      return savings.getBalance();
    } else if (account.equals("C")) {
      return checking.getBalance();
    }

    return -1;
  }

  @Override
  public String toString() {
    return "Checking Balance: $" + checking + "\nSavings Balance: $" + savings;
  }

}
