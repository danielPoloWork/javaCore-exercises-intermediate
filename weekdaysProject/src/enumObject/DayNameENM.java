package enumObject;

public enum DayNameENM {

  SUNDAY("Sunday is cool."),
  MONDAY("Monday is bad."),
  TUESDAY("Tuesday is still bad."),
  WEDNESDAY("Wednesday is so so"),
  THURSDAY("Thursday is fine."),
  FRIDAY("Friday is nice."),
  SATURDAY("Saturday is the best.");

  private String label;

  DayNameENM(String labelArg) {
    this.label = labelArg;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String labelArg) {
    this.label = labelArg;
  }
}