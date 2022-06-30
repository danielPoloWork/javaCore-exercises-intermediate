package runnable;

import dataObject.PackageColoredDTA;
import dataObject.PackageDTA;
import enumObject.ColorENM;

public class PackagingRNB {

  public static void main(String[] args) {
    PackageDTA packageOne = new PackageDTA(3.5, 4.5, 6);
    packageOne.setNumber(3);
    System.out.print(packageOne.getVolume());

    PackageColoredDTA coloredPackageOne = new PackageColoredDTA(2.4, 5.3, 5.5);
    coloredPackageOne.setColor(ColorENM.RED);
    coloredPackageOne.printVolume();
  }
}
