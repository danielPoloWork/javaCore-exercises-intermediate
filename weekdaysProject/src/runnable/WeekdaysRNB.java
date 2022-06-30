package runnable;

import enumObject.DayNameENM;

public class WeekdaysRNB {

  DayNameENM day;

  // Constructor
  public WeekdaysRNB(DayNameENM day) {
    this.day = day;
  }

  // Prints a line about Day using switch
  public void dayIsLike() {
    System.out.printf("%s\n\n", day.getLabel());
  }

  // Driver method
  public static void main(String[] args) {
    String dayString  = "MONDAY";
    WeekdaysRNB wdaObj = new WeekdaysRNB(DayNameENM.valueOf(dayString.trim().toUpperCase()));
    wdaObj.dayIsLike();

    DayNameENM[] daysArray = DayNameENM.values();
    for (DayNameENM d : daysArray) {
      System.out.printf("Enum_%s at index %s ==> %s \n", d, d.ordinal(), d.getLabel());
    }
  }
}