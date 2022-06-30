package dataObject;

import dataObject.RoomDTO;

public class RoomReservedSeatsDTO extends RoomDTO {

  // DECLARATION
  private int rowsFullyReserved;

  // CONSTRUCTOR
  RoomReservedSeatsDTO(String movieNameArg, int rowAmountArg) {
    super(movieNameArg, rowAmountArg);
  }

  // GET METHODS
  public int getRowsFullyReserved() {
    return rowsFullyReserved;
  }

  // SET METHODS
  public void setRowsFullyReserved() {
    this.rowsFullyReserved = (super.seatsReserved / super.ROW_SEATS_MAX);
  }

  // PRINT METHODS
  public void printPreview(int roomNumberArg) {
    System.out.printf("\nCinema room %s\n\tSCREENS: %s", roomNumberArg, super.movieName);
    System.out.printf("\n\tROW AMOUNT: %s\n\tROWS FULLY RESERVED: %s\n\tAMOUNT OF SEATS RESERVED: %s\n----------------------------",
        super.rowAmount, this.rowsFullyReserved, super.seatsReserved);
  }
}
