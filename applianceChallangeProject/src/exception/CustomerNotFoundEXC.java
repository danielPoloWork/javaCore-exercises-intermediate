package exception;

public class CustomerNotFoundEXC extends Throwable {

  public CustomerNotFoundEXC(String customerIdArg) {
    super(String.format("Customer with id %s not found", customerIdArg));
  }
}
