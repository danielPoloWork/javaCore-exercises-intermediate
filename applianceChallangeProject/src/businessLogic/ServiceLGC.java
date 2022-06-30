package businessLogic;

import java.util.HashSet;
import java.util.Set;

public class ServiceLGC {

  private final Set<CustomerDTA> customers;

  public ServiceLGC() {
    this.customers = new HashSet<>();
  }

  public CustomerDTA getCustomer(String customerIdArg) throws CustomerNotFoundEXC {
    for (CustomerDTA customer : this.customers) {
      if (customer.getId().equals(customerIdArg)) {
        return customer;
      }
    }
    throw new CustomerNotFoundEXC(customerIdArg);
  }

  public CustomerDTA addCustomer(CustomerDTA customerArg) throws CustomerNotAddedEXC {
    try {
      return getCustomer(customerArg.getId());
    } catch (CustomerNotFoundEXC e) {
      if (this.customers.add(customerArg)) {
        return customerArg;
      } else {
        throw new CustomerNotAddedEXC();
      }
    }
  }

  public CustomerDTA updateApplianceStatus(String applainceId, boolean statusArg) throws ApplianceNotFoundEXC {
    ApplianceDTA appliance;
    boolean isFound = false;
  }
}
