package runnable;

import enumObject.dayNameENO;

public class weekdaysRNB {

  dayNameENO day;

  // Constructor
  public weekdaysRNB(dayNameENO day) {
    this.day = day;
  }

  // Prints a line about Day using switch
  public void dayIsLike() {
    System.out.printf("%s\n\n", day.getLabel());
  }

  // Driver method
  public static void main(String[] args) {
    String dayString  = "MONDAY";
    weekdaysRNB wdaObj = new weekdaysRNB(dayNameENO.valueOf(dayString.trim().toUpperCase()));
    wdaObj.dayIsLike();

    dayNameENO[] daysArray = dayNameENO.values();
    for (dayNameENO d : daysArray) {
      System.out.printf("Enum_%s at index %s ==> %s \n", d, d.ordinal(), d.getLabel());
    }
  }
}