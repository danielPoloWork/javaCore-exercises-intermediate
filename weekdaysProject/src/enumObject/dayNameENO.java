package enumObject;

public enum dayNameENO {

  SUNDAY("Sunday is cool."),
  MONDAY("Monday is bad."),
  TUESDAY("Tuesday is still bad."),
  WEDNESDAY("Wednesday is so so"),
  THURSDAY("Thursday is fine."),
  FRIDAY("Friday is nice."),
  SATURDAY("Saturday is the best.");

  private String label;

  dayNameENO(String labelArg) {
    this.label = labelArg;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String labelArg) {
    this.label = labelArg;
  }
}