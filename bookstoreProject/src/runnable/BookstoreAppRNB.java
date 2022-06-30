package runnable;

import businessLogic.BookstoreLGC;
import dataObject.AuthorDTA;
import dataObject.BookDTA;
import enumObject.BookGenreENM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookstoreAppRNB {

  public static void main(String[] args) {
    boolean exit = false;
    List<BookDTA> bookList = generateInStockBooks();
    BookstoreLGC bookstoreObj = new BookstoreLGC(bookList);

    BookDTA harryPotterELaCameraDeiSegreti = new BookDTA(
        "000-0-00-000004-4",
         new AuthorDTA("B2", "J.K.", "Rowling", 19700202),
        "harry Potter e la camera dei segreti",
        "Giocano con le bacchette",
        BookGenreENM.FANTASY,
        20,
        50.00);
    bookstoreObj.addBook(harryPotterELaCameraDeiSegreti);

    System.out.println("------------------------------");
    System.out.println("|         BOOKSTORE          |");
    System.out.println("------------------------------");
    Scanner scannerObj = new Scanner(System.in);
    System.out.print(bookstoreObj.toString());

    while (!exit) {
      System.out.println("Choose book name to buy:");
      String bookName = scannerObj.nextLine();

      try {
        BookDTA bookFound = bookstoreObj.findByBookName(bookName);

        if (bookFound == null) {
          System.out.println("Selected book does not exists!");
        } else {
          System.out.print("Select quantity to buy: ");
          String quantity = scannerObj.nextLine();
          double parsedQuantity = Double.parseDouble(quantity);
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }

      System.out.println("Do you want to continue shopping (Yes/No)?");
      String yesNo = scannerObj.nextLine();
      if (yesNo.equals("No")) {
        exit = true;
      } else {
        System.out.println(bookList.toString());
      }
    }
  }


  private static List<BookDTA> generateInStockBooks() {
    AuthorDTA nelsonMandela   = new AuthorDTA("A1", "Nelson", "Mandela", 19600101);
    AuthorDTA jKRowling       = new AuthorDTA("B2", "J.K.", "Rowling", 19700202);
    AuthorDTA giacomoLeopardi = new AuthorDTA("C3", "Giacomo", "Leopardi", 19800303);

    List<BookDTA> books = new ArrayList<BookDTA>();

    BookDTA longWayToFreedom = new BookDTA(
        "000-0-00-000001-1",
         nelsonMandela,
        "Long way to freedom",
        "Una lunga via per la liberta",
        BookGenreENM.BIOGRAPHY,
        10,
        12.00);

    BookDTA harryPotter = new BookDTA(
        "000-0-00-000002-2",
         jKRowling,
        "Harry Potter e la pietra filosofale",
        "Si gioca a scacchi",
        BookGenreENM.FANTASY,
        3,
        19.00);

    BookDTA lInfinito = new BookDTA(
        "000-0-00-000003-3",
         giacomoLeopardi,
        "L'infinito",
        "Poema",
        BookGenreENM.LITERATURE,
        40,
        7.00);


    books.add(longWayToFreedom);
    books.add(harryPotter);
    books.add(lInfinito);

    return books;
  }
}
