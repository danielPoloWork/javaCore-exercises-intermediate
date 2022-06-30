package dataObject;

import enumObject.BookGenreENM;

public class BookDTA {

  // DECLARATION
  private final String isbn;
  private final String name;
  private final String description;
  private final BookGenreENM genre;
  private final AuthorDTA authorDTA;

  private int    inStock;
  private double price;

  // CONSTRUCTOR
  public BookDTA(String isbnArg, AuthorDTA authorArg, String nameArg, String descriptionArg,
      BookGenreENM genreArg, int inStockArg, double priceArg) {
    this.isbn        = isbnArg;
    this.authorDTA = authorArg;
    this.name        = nameArg;
    this.description = descriptionArg;
    this.genre       = genreArg;
    this.inStock     = inStockArg;
    this.price       = priceArg;
  }

  // GET METHODS
  public String getIsbn() {
    return this.isbn;
  }
  public AuthorDTA getAuthorCode() {
    return this.authorDTA;
  }
  public String getName() {
    return this.name;
  }
  public String getDescription() {
    return this.description;
  }
  public BookGenreENM getGenre() {
    return this.genre;
  }
  public int    getInStock() {
    return this.inStock;
  }
  public double getPrice() {
    return this.price;
  }

  // SET METHODS
  public void setInStock(int inStockArg) {
    this.inStock = inStockArg;
  }
  public void setPrice(double priceArg) {
    this.price = priceArg;
  }

  @Override
  public String toString() {
    return String.format("\tISBN: %s\n\tName: %s\n\tDescription: %s\n\tIn stock: %s\n\tPrice: %s\n----------------------------", this.isbn, this.name, this.description, this.inStock, this.price);
  }

  // @Overload
  public boolean equals(BookDTA bookArg) {
    return this.name.equals(bookArg.getName()) && this.isbn.equals(bookArg.getIsbn());
  }
}
