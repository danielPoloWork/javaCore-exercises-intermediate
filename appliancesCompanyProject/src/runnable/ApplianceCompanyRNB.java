package runnable;

import dataObject.ApplianceDTA;
import businessLogic.ServiceLGC;
import dataObject.CustomerDTA;
import enumObject.dataObject.ApplianceTypeENM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplianceCompanyRNB {

  public static void main(String[] args) {
    List<CustomerDTA> customerList   = new ArrayList<>();
    List<ApplianceDTA> applianceList = new ArrayList<>();

    customerList = setCustomer();
    applianceList = setAppliance(customerList);

    ServiceLGC services = new ServiceLGC(applianceList, customerList);
    Scanner input = new Scanner(System.in);
    boolean exit  = false;

    getInitialMessage();
    getOperationTypeMessage();

    int optionOT = Integer.parseInt(input.nextLine());

    while (!exit) {
      int optionFO;
      int optionDO;

      switch (optionOT) {
        case 1:
          getFindOperationMessage();
          optionFO = Integer.parseInt(input.nextLine());
          exit     = getFindOperationSwitch(optionFO, services, input);
          break;
        case 2:
          getDataOperationMessage();
          optionDO = Integer.parseInt(input.nextLine());
          exit     = getDataOperationSwitch(optionDO, services, input);
          break;
        case 0:
          exit = true;
      }
    }
  }

  private static List<CustomerDTA> setCustomer() {

    List<CustomerDTA> customers = new ArrayList<>();

    CustomerDTA customer01 = new CustomerDTA("AAAAAAA100AA","NameA", "SurnameA");
    CustomerDTA customer02 = new CustomerDTA("BBBBBBB211BB","NameB", "SurnameA");
    CustomerDTA customer03 = new CustomerDTA("CCCCCCC333CC","NameC", "SurnameC");

    customers.add(0,customer01);
    customers.add(1,customer02);
    customers.add(2,customer03);

    return customers;
  }

  private static List<ApplianceDTA> setAppliance(List<CustomerDTA> customerArgs) {

    List<ApplianceDTA> appliances = new ArrayList<>();

    ApplianceDTA appliance01 = new ApplianceDTA(
        0001,
        "Model AAA",
        ApplianceTypeENM.FRIDGE,
        customerArgs.get(0).getTaxCode(),
        true,
        "29/06/2022 12:00");
    ApplianceDTA appliance02 = new ApplianceDTA(
        0002,
        "Model BBB",
        ApplianceTypeENM.OVEN,
        customerArgs.get(1).getTaxCode(),
        true,
        "28/06/2022 13:00");
    ApplianceDTA appliance03 = new ApplianceDTA(
        0003,
        "Model CCC",
        ApplianceTypeENM.OVEN,
        customerArgs.get(2).getTaxCode(),
        false,
        "27/06/2022 14:00");

    appliances.add(0,appliance01);
    appliances.add(1,appliance02);
    appliances.add(2,appliance03);

    return appliances;
  }

  private static void getInitialMessage(){
    System.out.println("-------------------------------------------------------------");
    System.out.println("|                     APPLIANCE COMPANY                     |");
    System.out.println("-------------------------------------------------------------");
  }

  private static void getOperationTypeMessage() {
    System.out.println("| Select one of the options:                                |");
    System.out.println("|   1. Find and show information on the screen              |");
    System.out.println("|   2. Set, add, remove or update an appliance or a customer|");
    System.out.println("|   0. Exit                                                 |");
    System.out.println("-------------------------------------------------------------");
  }

  private static void getFindOperationMessage() {
    System.out.println("-------------------------------------------------------------");
    System.out.println("| Select one of the options:                                |");
    System.out.println("|   1. Find all appliances and their customers              |");
    System.out.println("|   2. Find all customers and their appliances              |");
    System.out.println("|   3. Find an appliance given the appliance's id           |");
    System.out.println("|   4. Find an appliance given the customer's tax code      |");
    System.out.println("|   5. Find a customer given the customer's tax code        |");
    System.out.println("|   6. Find a customer given the appliance's id             |");
    System.out.println("|   7. Find all connected appliances                        |");
    System.out.println("|   8. Find all disconnected appliances                     |");
    System.out.println("|   9. Find all connected customers                         |");
    System.out.println("|  10. Find all disconnected customers                      |");
    System.out.println("|   0. Exit                                                 |");
    System.out.println("-------------------------------------------------------------");
  }

  private static void getDataOperationMessage() {
    System.out.println("-------------------------------------------------------------");
    System.out.println("| Select one of the options:                                |");
    System.out.println("|   1. Add an appliance                                     |");
    System.out.println("|   2. Add a customer                                       |");
    System.out.println("|   3. Update an appliance status                           |");
    System.out.println("|   0. Exit                                                 |");
    System.out.println("-------------------------------------------------------------");
  }

  private static void getDEApplianceTypeMessage() {
    System.out.println("| Select one of the options:                                |");
    System.out.println("|   1. TV                                                   |");
    System.out.println("|   2. MOBILE PHONE                                         |");
    System.out.println("|   3. COMPUTER                                             |");
    System.out.println("|   4. TABLET                                               |");
    System.out.println("|   5. FRIDGE                                               |");
    System.out.println("|   6. OVEN                                                 |");
    System.out.println("-------------------------------------------------------------\n");
  }

  private static boolean getFindOperationSwitch(int optionFOArg, ServiceLGC servicesArg, Scanner inputArg) {
    if (optionFOArg == 0) {
      return true;
    } else {
      switch (optionFOArg) {
        case 1:
          servicesArg.printAppliances();
          break;
        case 2:
          servicesArg.printCustomers();
          break;
        case 3:
          System.out.print("Enter the id of the appliance you want to search for:\n");
          int id = Integer.parseInt(inputArg.nextLine());
          servicesArg.printApplianceById(id);
          break;
        case 4:
          System.out.print("Enter the customer tax-code to search its appliances:\n");
          String customerTC = inputArg.nextLine();
          servicesArg.printApplianceByCustomerTaxCode(customerTC);
          break;
        case 5:
          System.out.print("Enter the tax-code of the customer you want to search for:\n");
          String taxCode = inputArg.nextLine();
          servicesArg.printCustomerByTaxCode(taxCode);
          break;
        case 6:
          System.out.print("Enter the appliance's id to search its customer:\n");
          int applianceId = Integer.parseInt(inputArg.nextLine());
          servicesArg.printCustomerByApplianceId(applianceId);
          break;
        case 7:
          servicesArg.printAppliancesByStatus(true);
          break;
        case 8:
          servicesArg.printAppliancesByStatus(false);
          break;
        case 9:
          servicesArg.printCustomersByStatus(true);
          break;
        case 10:
          servicesArg.printCustomersByStatus(false);
      }
      return false;
    }
  }

  private static boolean getDataOperationSwitch(int optionDOArg, ServiceLGC servicesArg, Scanner inputArg) {

    ApplianceDTA appliance;
    CustomerDTA customer;

    if (optionDOArg == 0) {
      return true;
    } else {
      switch (optionDOArg) {
        case 1:
          System.out.print("Enter the id:\n");
          int id = Integer.parseInt(inputArg.nextLine());

          System.out.print("Enter the model:\n");
          String model = inputArg.nextLine();

          getDEApplianceTypeMessage();
          int typeInt = Integer.parseInt(inputArg.nextLine());
          ApplianceTypeENM typeEnum = ApplianceTypeENM.DEFAULT;
          switch (typeInt) {
            case 1:
              typeEnum = ApplianceTypeENM.TV;
              break;
            case 2:
              typeEnum = ApplianceTypeENM.MOBILE_PHONE;
              break;
            case 3:
              typeEnum = ApplianceTypeENM.COMPUTER;
              break;
            case 4:
              typeEnum = ApplianceTypeENM.TABLET;
              break;
            case 5:
              typeEnum = ApplianceTypeENM.FRIDGE;
              break;
            case 6:
              typeEnum = ApplianceTypeENM.OVEN;
          }

          System.out.print("Enter the customer tax code:\n");
          String customerTC = inputArg.nextLine();
          String dataTime = servicesArg.parseDateTimeToString("yyyy/MM/dd HH:mm");

          if ((servicesArg.findApplianceById(id) != null) || (
              servicesArg.findCustomerByTaxCode(customerTC) != null)) {
            System.out.print("Appliance or customer already exists!\n");
          } else {
            appliance = new ApplianceDTA(id, model, typeEnum, customerTC, true, dataTime);
            servicesArg.addAppliance(appliance);
          }
          break;
        case 2:
          System.out.print("Enter tax-code:\n");
          String taxCode = inputArg.nextLine();

          System.out.print("Enter name:\n");
          String name = inputArg.nextLine();

          System.out.print("Enter surname:\n");
          String surname = inputArg.nextLine();

          customer = new CustomerDTA(taxCode, name, surname);
          servicesArg.addCustomer(customer);
          break;
        case 3:
          System.out.print("Enter the id of the appliance you want to update:\n");
          int applianceId = Integer.parseInt(inputArg.nextLine());
          String applianceDateTime = servicesArg.parseDateTimeToString("yyyy/MM/dd HH:mm");

          servicesArg.updateApplianceStatus(applianceId, applianceDateTime);
          break;
      }
      return false;
    }
  }
}
