package dataObject;

import dataObject.ApplianceDTA;
import exception.ApplianceNotAddedEXC;
import exception.ApplianceNotFoundEXC;
import java.util.Set;

public class CustomerDTA {

  private final String id;
  private final String taxCode;
  private final Set<ApplianceDTA> appliances;

  public CustomerDTA(String idArg, String taxCodeArg, Set<ApplianceDTA> appliancesArg) {
    this.id = idArg;
    this.taxCode = taxCodeArg;
    this.appliances = appliancesArg;
  }

  public String getId() {
    return this.id;
  }

  public String getTaxCode() {
    return this.taxCode;
  }

  public ApplianceDTA getAppliances(String applianceIdArg) throws ApplianceNotFoundEXC {
    for (ApplianceDTA appliance : appliances) {
      if (appliance.getId().equals(applianceIdArg)) {
        return appliance;
      }
    }
    throw new ApplianceNotFoundEXC(this.id, applianceIdArg);
  }

  public void addAppliance(ApplianceDTA appliance) throws ApplianceNotAddedEXC {
    try {
      ApplianceDTA applianceFound = getAppliances(appliance.getId());
      applianceFound.setStatus(appliance.isStatus());
    } catch (ApplianceNotFoundEXC e) {
      if (!this.appliances.add(appliance)) {
        throw new ApplianceNotAddedEXC();
      }
    }

  }
}
