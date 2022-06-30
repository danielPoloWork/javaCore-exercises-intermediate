package dataObject;

public class AuthorDTA {

  // DECLARATION
  private final String taxCode;
  private final String name;
  private final String surname;
  private final int    birthday;

  // CONSTRUCTOR
  public AuthorDTA(String taxCodeArg, String nameArg, String surnameArg, int birthdayArg) {
    this.taxCode = taxCodeArg;
    this.name = nameArg;
    this.surname = surnameArg;
    this.birthday = birthdayArg;
  }

  // GET METHODS
  public String getTaxCode() {
    return this.taxCode;
  }
  public String getName() {
    return this.name;
  }
  public String getSurname() {
    return this.surname;
  }
  public int    getBirthday() {
    return this.birthday;
  }

  // @Overload
  public boolean equals(AuthorDTA authorArg) {
    return this.taxCode.equals(authorArg.taxCode) &&
        this.name.equals(authorArg.name) &&
        this.surname.equals(authorArg.surname);
  }
}
