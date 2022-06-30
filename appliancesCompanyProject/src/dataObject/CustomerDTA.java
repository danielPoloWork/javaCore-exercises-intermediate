package dataObject;

public class CustomerDTA {

  // DECLARATION
  private final String taxCode;
  private final String name;
  private final String surname;

  // CONSTRUCTOR
  public CustomerDTA(String taxCodeArg, String nameArg, String surnameArg) {
    this.taxCode   = taxCodeArg;
    this.name      = nameArg;
    this.surname   = surnameArg;
  }

  // GET METHODS
  public String getName() {
    return this.name;
  }

  public String getSurname() {
    return this.surname;
  }

  public String getTaxCode() {
    return this.taxCode;
  }
}
