package interfaceObject;

import dataObject.BeverageDTA;
import java.util.List;

public interface MachineITF {

  // GET METHODS
  double getTheChange(double beveragePriceArg, double customerMoneyArg);
  List<BeverageDTA> getBeverages();
  void getDispenseBeverage(int beverageIndexArg, double customerMoneyArg);
  double cancelOperation(double customerMoneyArg);

  // SET METHODS
  void setCustomerMoney(double customerMoneyArg);
  void setDepositMoney(double depositMoneyArg);
  void setRestockBeverage(int beverageIndexArg, int beverageRestockArg);

  // UPDATE METHODS
  void updateDepositMoney(double beveragePriceArg);

  void updateDispenseBeverage(int beverageIndexArg);
}
