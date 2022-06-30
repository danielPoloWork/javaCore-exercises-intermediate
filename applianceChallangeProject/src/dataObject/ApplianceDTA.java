package dataObject;

public class ApplianceDTA {

  private final String id;
  private final String customerId;
  private boolean status;

  public ApplianceDTA(String idArg, String customerIdArg, boolean statusArg) {
    this.id = idArg;
    this.customerId = customerIdArg;
    this.status = statusArg;
  }

  public String getId() {
    return this.id;
  }

  public String getCustomerId() {
    return this.customerId;
  }

  public boolean isStatus() {
    return this.status;
  }

  public void setStatus(boolean statusArg) {
    this.status = statusArg;
  }
}
