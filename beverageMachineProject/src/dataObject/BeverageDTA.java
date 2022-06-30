package dataObject;

public class BeverageDTA {

  // DECLARATION
  private final int code;
  private final BeverageNameENM name;
  private final String description;
  private final String dispensingTime;

  private int inStock;
  private double price;

  // CONSTRUCTOR
  BeverageDTA(int codeArg, BeverageNameENM nameArg, String descriptionArg, int inStockArg,
      double priceArg, String dispensingTimeArg) {
    this.code = codeArg;
    this.name = nameArg;
    this.description = descriptionArg;
    this.inStock = inStockArg;
    this.price = priceArg;
    this.dispensingTime = dispensingTimeArg;
  }

  // GET METHODS
  public int getCode() {
    return this.code;
  }

  public String getDescription() {
    return this.description;
  }

  public String getDispensingTime() {
    return this.dispensingTime;
  }

  public BeverageNameENM getName() {
    return this.name;
  }

  public double getPrice() {
    return price;
  }

  public int getInStock() {
    return inStock;
  }

  // SET METHODS
  public void setPrice(double priceArg) {
    this.price = priceArg;
  }

  public void setInStock(int inStockArg) {
    this.inStock = inStockArg;
  }

  @Override
  public String toString() {
    return String.format(
        "\tCODE: %s\n\tNAME: %s\n\tDESCRIPTION: %s\n\tDISPENSING TIME: %s\n\tIn stock: %s\n\tPrice: %s\n----------------------------",
        this.code, this.name, this.description, this.dispensingTime, this.inStock, this.price);
  }

  // @Overload
  public boolean equals(BeverageDTA beverageArg) {
    return this.name.equals(beverageArg.getName()) && (this.code == beverageArg.getCode());
  }
}
