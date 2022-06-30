package businessLogic;

import dataObject.AuthorDTA;
import dataObject.BookDTA;
import java.util.ArrayList;
import java.util.List;

public class BookstoreLGC {

  // List<DataType> è una interfaccia
  // ArrayList<DataType> è una classe
  // List<dataobject.Book> books = new ArrayList<dataobject.Book>();
  private final List<BookDTA> books;

  public BookstoreLGC(List<BookDTA> booksArg) {
    this.books = booksArg;
  }

  public List<BookDTA> getBooks() {
    return this.books;
  }

  public void addBook(BookDTA bookArg) {
    this.books.add(bookArg);
  }

  private void updateBookPrice(String isbnArg, int bookPriceArg) {
    BookDTA bookFound = findByBookIsbn(isbnArg);
    if (bookFound != null) {
      bookFound.setPrice(bookPriceArg);
    }
  }

  public void removeBook(BookDTA bookArg) {
    this.books.remove(bookArg);
  }

  public BookDTA findByBookIsbn(String bookIsbn) {
    for (BookDTA book : this.books) {
      if (book.getIsbn().equals(bookIsbn)) {
        return book;
      }
    }
    return null;
  }

  public BookDTA findByBookName(String bookName) throws Exception {
    for (BookDTA book : this.books) {
      if (book.getName().equals(bookName)) {
        return book;
      }
    }
    throw new Exception(String.format("No book found with name %s", bookName));
    //return null;
  }

  public BookDTA findByBookGenre(String bookGenre) {
    for (BookDTA book : this.books) {
      if (book.getGenre().equals(bookGenre)) {
        return book;
      }
    }
    return null;
  }

  public List<BookDTA> findByAuthor(AuthorDTA authorDTAArg) {
    List<BookDTA> booksFound = new ArrayList<BookDTA>();
    for ( BookDTA bookCompared : this.books) {
      if (bookCompared.getAuthorCode().equals(authorDTAArg)) {
        booksFound.add(bookCompared);
      }
    }
    return booksFound;
  }

  public void sellBook(String isbnArg, int bookSoldQuantity) {
    BookDTA bookFound = findByBookIsbn(isbnArg);
    if ((bookFound != null) && (bookFound.getInStock() > bookSoldQuantity)) {
      bookFound.setInStock(bookFound.getInStock() - bookSoldQuantity);
    }
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();

    for (BookDTA book : this.books) {
      s.append(book.toString()).append("\n");
    }
    return s.toString();
  }

}
