package dataObject;
import enumObject.dataObject.ApplianceTypeENM;

public class ApplianceDTA {

  // DECLARATION
  private final int              id;
  private final String           model;
  private final ApplianceTypeENM type;
  private final String           customerTC;

  private boolean status;
  private String  connectionDataTime;

  // CONSTRUCTOR
  public ApplianceDTA(int idArg, String modelArg, ApplianceTypeENM typeArg, String customerTCArg,
      boolean statusArg, String connectionDataTimeArg) {
    this.id                 = idArg;
    this.model              = modelArg;
    this.type               = typeArg;
    this.customerTC         = customerTCArg;
    this.status             = statusArg;
    this.connectionDataTime = connectionDataTimeArg;
  }

  // GET METHODS
  public String getConnectionDataTime() {
    return this.connectionDataTime;
  }

  public String getCustomerTC() {
    return this.customerTC;
  }

  public int getId() {
    return this.id;
  }

  public String getModel() {
    return this.model;
  }

  public ApplianceTypeENM getType() {
    return this.type;
  }

  public boolean isStatus() {
    return this.status;
  }

  // SET METHODS
  public void setConnectionDataTime(String connectionDataTimeArg) {
    this.connectionDataTime = connectionDataTimeArg;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}
