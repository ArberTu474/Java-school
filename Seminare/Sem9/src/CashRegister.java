// Reimplement the CashRegister class so that it keeps track of the price of each added
// item in an ArrayList<Double>. Remove the itemCount and totalPrice instance variables.
// Reimplement the clear, addItem, getTotal, and getCount methods. Add a method
// displayAll that displays the prices of all items in the current sale.

import java.util.ArrayList;

/**
 * A simulated cash register that tracks the item count and
 * the total amount due.
 */
public class CashRegister {
  ArrayList<Double> itemPrices;

  /**
   * Constructs a cash register with cleared item count and total.
   */
  public CashRegister() {
    itemPrices = new ArrayList<Double>();

  }

  /**
   * Adds an item to this cash register.
   * 
   * @param price the price of this item
   */
  public void addItem(double price) {
    itemPrices.add(price);
  }

  /**
   * Gets the price of all items in the current sale.
   * 
   * @return the total amount
   */
  public double getTotal() {

    double total = 0.0;
    for (double item : itemPrices) {
      total += item;
    }
    return total;
  }

  /**
   * Gets the number of items in the current sale.
   * 
   * @return the item count
   */
  public int getCount() {
    return itemPrices.size();
  }

  /**
   * Clears the item count and the total.
   */
  public void clear() {
    itemPrices.clear();
  }

  /**
   * Displays the prices of all items in the current sale
   */
  public void displayAll() {
    for (double item : itemPrices) {
      System.out.printf("%.2f\n", item);
    }
  }
}
