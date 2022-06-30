package dataObject;

import enumObject.ColorENM;

public class PackageColoredDTA extends PackageDTA {

  // DECLARATION
  private ColorENM color;

  // CONSTRUCTOR
  public PackageColoredDTA(double baseArg, double heightArg, double depthArg) {
    super(baseArg, heightArg, depthArg);
  }

  // GET METHODS
  public ColorENM getColor() {
    return color;
  }

  // SET METHODS
  public void setColor(ColorENM colorArg) {
    this.color = colorArg;
  }

  // PRINT METHODS
  public void printPackage() {
    System.out.printf("Package n°%s values:\n", super.number);
    System.out.printf("\t%sb %sh %sd\n", super.base, super.height, super.depth);
  }

  public void printVolume() {
    System.out.printf("Package n°%s volume:\n", super.number);
    System.out.printf("\t%s", super.volume);
  }
}