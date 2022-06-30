package dataObject;

public class PackageDTA {

  // DECLARATION
  protected final double base;
  protected final double height;
  protected final double depth;
  protected final double volume;

  protected int number;

  // CONSTRUCTOR
  public PackageDTA(double baseArg, double heightArg, double depthArg) {
    this.base   = baseArg;
    this.height = heightArg;
    this.depth  = depthArg;
    this.volume = (this.base * this.height * this.depth);
  }
  // GET METHODS
  public double getBase() {
    return this.base;
  }

  public double getDepth() {
    return this.depth;
  }

  public double getHeigth() {
    return this.height;
  }

  public int getNumber() {
    return number;
  }

  public double getVolume() {
    return this.volume;
  }
  // SET METHODS
  public void setNumber(int numberArg) {
    this.number = numberArg;
  }
}