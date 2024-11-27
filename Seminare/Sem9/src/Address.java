// Implement a class Address. An address has a house number, a street, an optional
// apartment number, a city, a state, and a postal code. Supply two constructors: one
// with an apartment number and one without. Supply a print method that prints the
// address with the street on one line and the city, state, and zip code on the next line.
// Supply a method public boolean comesBefore(Address other) that tests whether this
// address comes before another when the addresses are compared by postal code.

public class Address {
  private int houseNumber;
  private int streetNumber;
  private int apartmentNumber;

  private String city;
  private String state;
  private int postalCode;

  Address(int houseNumber, int streetNumber, int apartmentNumber, String city, String state, int postalCode) {
    this.houseNumber = houseNumber;
    this.streetNumber = streetNumber;
    this.apartmentNumber = apartmentNumber;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;
  }

  Address(int houseNumber, int streetNumber, String city, String state, int postalCode) {
    this.houseNumber = houseNumber;
    this.streetNumber = streetNumber;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;
  }

  public void printInfo() {
    System.out.println("House Nr: " + houseNumber + ", Street Nr: " + streetNumber + ", Apartment Nr: "
        + ((apartmentNumber == 0) ? "None" : apartmentNumber));
    System.out.println("City: " + city + ", State: " + state + ", ZIP Code: " + postalCode);
  }

}
