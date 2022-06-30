package exception;

public class ApplianceNotFoundEXC extends Exception {

  public ApplianceNotFoundEXC(String customerIdArg, String applianceIdArg) {
    super(String.format("Customer with id %s does not contains appliance id %s", customerIdArg, applianceIdArg));
  }
}
