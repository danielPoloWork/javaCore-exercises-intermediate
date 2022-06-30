package businessLogic;
import dataObject.ApplianceDTA;
import dataObject.CustomerDTA;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ServiceLGC {

  // DECLARATION
  List<ApplianceDTA> appliances;
  List<CustomerDTA> customers;

  // CONSTRUCTOR
  public ServiceLGC(List<ApplianceDTA> applianceArgs, List<CustomerDTA> customerArgs) {
    this.appliances = applianceArgs;
    this.customers  = customerArgs;
  }

  // GET METHODS
  public List<ApplianceDTA> getAppliances() {
    return this.appliances;
  }

  public List<CustomerDTA> getCustomers() {
    return this.customers;
  }

  // SET METHODS
  public void setAppliances(List<ApplianceDTA> applianceArgs) {
    this.appliances = applianceArgs;
  }

  public void setCustomers(List<CustomerDTA> customerArgs) {
    this.customers = customerArgs;
  }

  // ADD METHODS
  public void addAppliance(ApplianceDTA applianceArg) {
    this.appliances.add(applianceArg);
  }

  public void addCustomer(CustomerDTA customerArg) {
    this.customers.add(customerArg);
  }

  // REMOVE METHODS
  public void removeAppliance(ApplianceDTA applianceArg) {
    this.appliances.remove(applianceArg);
  }

  public void removeCustomer(CustomerDTA customerArg) {
    this.appliances.remove(customerArg);
  }

  // UPDATE METHODS
  public void updateApplianceStatus(int applianceIdArg, String connectionDataTimeArg) {
    ApplianceDTA applianceFound = findApplianceById(applianceIdArg);
    if (applianceFound != null) {
      applianceFound.setStatus(true);
      applianceFound.setConnectionDataTime(connectionDataTimeArg);
    }
  }


  // FIND METHODS
  public ApplianceDTA findApplianceById(int applianceIdArg) {
    for (ApplianceDTA appliance : this.appliances) {
      if (appliance.getId() == applianceIdArg) {
        return appliance;
      }
    }
    return null;
  }

  public ApplianceDTA findApplianceByCustomerTaxCode(int applianceIdArg, String customerTCArg) {
    for (CustomerDTA customer : this.customers) {
      if (customer.getTaxCode().equals(customerTCArg)) {
        return findApplianceById(applianceIdArg);
      }
    }
    return null;
  }

  public List<ApplianceDTA> findAppliancesByCustomerTaxCode(String customerTCArg) {
    List<ApplianceDTA> applianceList = this.getAppliances();
    for (ApplianceDTA appliance : this.appliances) {
      if (appliance.getCustomerTC().equals(customerTCArg)) {
        applianceList.add(appliance);
      }
    }
    return applianceList;
  }

  public CustomerDTA findCustomerByTaxCode(String customerTCArg) {
    for (CustomerDTA customer : this.customers) {
      if (customer.getTaxCode().equals(customerTCArg)) {
        return customer;
      }
    }
    return null;
  }

  public String findCustomerByApplianceId(int applianceIdArg) {
    for (ApplianceDTA appliance : this.appliances) {
      if (appliance.getId() == applianceIdArg) {
        return appliance.getCustomerTC();
      }
    }
    return null;
  }

  public List<ApplianceDTA> findAppliancesByStatus(boolean statusArg) {
    List<ApplianceDTA> applianceList = this.getAppliances();
    for (ApplianceDTA appliance : this.appliances) {
      if (appliance.isStatus() == true) {
        applianceList.add(appliance);
      }
    }
    return applianceList;
  }

  public List<CustomerDTA> findCustomersByStatus(boolean statusArg) {
    List<ApplianceDTA> applianceList = this.getAppliances();
    List<CustomerDTA> customerList = this.getCustomers();

    for (ApplianceDTA appliance : this.appliances) {
      if (appliance.isStatus() == statusArg) {
        for (CustomerDTA customer : this.customers) {
          if (customer.getTaxCode().equals(appliance.getCustomerTC())) {
            customerList.add(customer);
          }
        }
      }
    }
    return customerList;
  }


  // PRINT METHODS
  public void printAppliances() {
    List<CustomerDTA> customerList   = this.getCustomers();
    List<ApplianceDTA> applianceList = this.getAppliances();

    for (int a = 0; a < applianceList.size(); a++) {
      System.out.printf("""
              \tCustomer id: %s
              \tCustomer name: %s
              \tCustomer surname: %s
              \tAppliance id: %s
              \tAppliance model: %s
              \tAppliance type: %s
              \tIs appliance connected: %s
              \tConnection date: %s
              -------------------------------------------------------------\n""",
          customerList.get(a).getTaxCode(),
          customerList.get(a).getName(),
          customerList.get(a).getSurname(),
          applianceList.get(a).getId(),
          applianceList.get(a).getModel(),
          applianceList.get(a).getType(),
          applianceList.get(a).isStatus(),
          applianceList.get(a).getConnectionDataTime());
    }
  }

  public void printCustomers() {
    List<CustomerDTA> customerList = this.getCustomers();

    for (int a = 0; a < customerList.size(); a++) {
      System.out.printf("""
              \tCustomer id: %s
              \tCustomer name: %s
              \tCustomer surname: %s""",
          customerList.get(a).getTaxCode(),
          customerList.get(a).getName(),
          customerList.get(a).getSurname());

      List<ApplianceDTA> applianceList = findAppliancesByCustomerTaxCode(customerList.get(a).getTaxCode());

      for (int b = 0; b < applianceList.size(); b++) {
        System.out.printf("""
              \tAppliance id: %s
              \tAppliance model: %s
              \tAppliance type: %s
              \tIs appliance connected: %s
              \tConnection date: %s""",
            applianceList.get(b).getId(),
            applianceList.get(b).getModel(),
            applianceList.get(b).getType(),
            applianceList.get(b).isStatus(),
            applianceList.get(b).getConnectionDataTime());
      }
      System.out.print("-------------------------------------------------------------\n");
    }
  }

  public void printApplianceById(int idArg) {
    ApplianceDTA appliance = this.findApplianceById(idArg);
    CustomerDTA customer   = this.findCustomerByTaxCode(appliance.getCustomerTC());
    System.out.printf("""
              \tCustomer id: %s
              \tCustomer name: %s
              \tCustomer surname: %s
              \tAppliance id: %s
              \tAppliance model: %s
              \tAppliance type: %s
              \tIs appliance connected: %s
              \tConnection date: %s
              -------------------------------------------------------------\n""",
        customer.getTaxCode(),
        customer.getName(),
        customer.getSurname(),
        appliance.getId(),
        appliance.getModel(),
        appliance.getType(),
        appliance.isStatus(),
        appliance.getConnectionDataTime());
  }

  public void printApplianceByCustomerTaxCode(String customerTCArg) {
    CustomerDTA customer = this.findCustomerByTaxCode(customerTCArg);

    System.out.printf("""
              \tCustomer id: %s
              \tCustomer name: %s
              \tCustomer surname: %s""",
        customer.getTaxCode(),
        customer.getName(),
        customer.getSurname());

    List<ApplianceDTA> applianceList = findAppliancesByCustomerTaxCode(customerTCArg);
    for (int a = 0; a < applianceList.size(); a++) {
      System.out.printf("""
              \tAppliance id: %s
              \tAppliance model: %s
              \tAppliance type: %s
              \tIs appliance connected: %s
              \tConnection date: %s""",
          applianceList.get(a).getId(),
          applianceList.get(a).getModel(),
          applianceList.get(a).getType(),
          applianceList.get(a).isStatus(),
          applianceList.get(a).getConnectionDataTime());
    }
    System.out.print("-------------------------------------------------------------\n");
  }

  public void printCustomerByTaxCode(String customerTCArg) {
    CustomerDTA customer = this.findCustomerByTaxCode(customerTCArg);

    System.out.printf("""
            \tCustomer id: %s
            \tCustomer name: %s
            \tCustomer surname: %s""",
        customer.getTaxCode(),
        customer.getName(),
        customer.getSurname());
    System.out.print("-------------------------------------------------------------\n");
  }

  public void printCustomerByApplianceId(int applianceIdArg) {
    String taxCode = findCustomerByApplianceId(applianceIdArg);
    CustomerDTA customer = this.findCustomerByTaxCode(taxCode);
    System.out.printf("""
            \tCustomer id: %s
            \tCustomer name: %s
            \tCustomer surname: %s""",
        customer.getTaxCode(),
        customer.getName(),
        customer.getSurname());
    System.out.print("-------------------------------------------------------------\n");
  }

  public void printAppliancesByStatus(boolean statusArg) {
    List<ApplianceDTA> applianceList = findAppliancesByStatus(statusArg);

    for (int a = 0; a < applianceList.size(); a++) {
      System.out.printf("""
              \tAppliance id: %s
              \tAppliance model: %s
              \tAppliance type: %s
              \tIs appliance connected: %s
              \tConnection date: %s""",
          applianceList.get(a).getId(),
          applianceList.get(a).getModel(),
          applianceList.get(a).getType(),
          applianceList.get(a).isStatus(),
          applianceList.get(a).getConnectionDataTime());
    }
    System.out.print("-------------------------------------------------------------\n");
  }

  public void printCustomersByStatus(boolean statusArg) {
    List<CustomerDTA> customerList = findCustomersByStatus(statusArg);

    for (int a = 0; a < customerList.size(); a++) {
      System.out.printf("""
              \tCustomer id: %s
              \tCustomer name: %s
              \tCustomer surname: %s""",
          customerList.get(a).getTaxCode(),
          customerList.get(a).getName(),
          customerList.get(a).getSurname());
      System.out.print("-------------------------------------------------------------\n");
    }
  }

  // PARSE
  public String parseDateTimeToString(String patternArg) {
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(patternArg);

    return myDateObj.format(myFormatObj);
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();

    for (ApplianceDTA book : this.appliances) {
      s.append(book.toString()).append("\n");
    }
    return s.toString();
  }
}
