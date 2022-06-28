public class Room {

  // DECLARATION
  protected final int ROW_SEATS_MAX = 21;
  protected final int rowAmount;

  protected String movieName;
  protected int    seatsReserved;

  // CONSTRUCTOR
  Room(String movieNameArg, int rowAmountArg) {
    this.rowAmount = rowAmountArg;
    this.movieName = movieNameArg;
    this.seatsReserved = 0;
  }

  // GET METHODS
  public String getMovieName() {
    return movieName;
  }

  public int getRoomSeatsAmount() {
    return (this.ROW_SEATS_MAX * this.rowAmount);
  }

  public int getRowAmount() {
    return rowAmount;
  }

  public int getRowSeatsMax() {
    return ROW_SEATS_MAX;
  }

  public int getSeatsAvailable() {
    return (this.getRoomSeatsAmount() - this.seatsReserved);
  }

  public int getSeatsReserved() {
    return seatsReserved;
  }

  // SET METHODS

  public void setMovieName(String movieNameArg) {
    this.movieName = movieNameArg;
  }

  public void setSeatsReserved(int seatsReservedArg) {
    this.seatsReserved = seatsReservedArg;
  }

  // UPDATE METHODS
  public void updateSeatsReserved(int seatsAvailableArg) {
    this.seatsReserved += seatsAvailableArg;
  }

  // PRINT METHODS
  public String printToString(int roomNumberArg) {
    return String.format("\tMovie title: %s"
            + "\n\tRoom number: %s"
            + "\n\tTotal seats: %s"
            + "\n\tNumber of rows: %s"
            + "\n\tAvailable seats: %s"
            + "\n\tReserved seats: %s"
            + "\n----------------------------",
        this.movieName,
        roomNumberArg,
        this.getRoomSeatsAmount(),
        this.rowAmount,
        this.getSeatsAvailable(),
        this.getSeatsReserved());
  }
}