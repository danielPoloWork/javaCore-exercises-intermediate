package businessLogic;

import dataObject.BeverageDTA;
import interfaceObject.MachineITF;
import java.util.List;

public class MachineLGC implements MachineITF {

  // DECLARATION
  private final List<BeverageDTA> beverages;

  private double depositMoney;

  // CONSTRUCTOR
  MachineLGC(double depositMoneyArg, List<BeverageDTA> beveragesArg) {
    this.depositMoney = depositMoneyArg;
    this.beverages    = beveragesArg;
  }

  // GET METHODS

  public List<BeverageDTA> getBeverages() {
    return this.beverages;
  }
  public void addBeverage(BeverageDTA beverageArg) {
    this.beverages.add(beverageArg);
  }
  private void updateBeveragePrice(int beverageCodeArg, int beveragePriceArg) {
    BeverageDTA beverageFound = findByBeverageCode(beverageCodeArg);
    if (beverageFound != null) {
      beverageFound.setPrice(beveragePriceArg);
    }
  }

  public BeverageDTA findByBeverageCode(int beverageCodeArg) {
    for (BeverageDTA beverage : this.beverages) {
      if (beverage.getCode() == beverageCodeArg) {
        return beverage;
      }
    }
    return null;
  }

  public void removeBeverage(BeverageDTA beverageArg) {
    this.beverages.remove(beverageArg);
  }

  @Override
  public void getDispenseBeverage(int beverageIndexArg, double customerMoneyArg) {

  }

  @Override
  public double getTheChange(double beveragePriceArg, double customerMoneyArg) {
    updateDepositMoney(beveragePriceArg);
    return (customerMoneyArg - beveragePriceArg);
  }
  @Override
  public double cancelOperation(double customerMoneyArg) {
    setCustomerMoney(customerMoneyArg);
    updateDepositMoney(customerMoneyArg);
    return customerMoneyArg;
  }

  // SET METHODS
  @Override
  public void setCustomerMoney(double customerMoneyArg) {
    this.depositMoney += customerMoneyArg;
  }
  @Override
  public void setDepositMoney(double depositMoneyArg) {
    this.depositMoney = depositMoneyArg;
  }
  @Override
  public void setRestockBeverage(int beverageIndexArg, int beverageRestockArg) {
    beverages[beverageIndexArg].setInStock(beverageRestockArg);
  }

  // UPDATE METHODS
  @Override
  public void updateDepositMoney(double moneyArg) {
    this.depositMoney -= moneyArg;
  }

  @Override
  public void updateDispenseBeverage(int beverageIndexArg) {
    int update = beverages[beverageIndexArg].getInStock();
    beverages[beverageIndexArg].setInStock(update - 1);
  }
}